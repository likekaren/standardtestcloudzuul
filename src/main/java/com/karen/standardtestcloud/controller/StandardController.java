package com.karen.standardtestcloud.controller;


import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.karen.standardtestcloud.po.PageQuery;
import com.karen.standardtestcloud.po.StandardQueryVo;
import com.karen.standardtestcloud.po.StandardlistCustom;
import com.karen.standardtestcloud.po.StandardresultCustom;
import com.karen.standardtestcloud.result.DataGridResultInfo;
import com.karen.standardtestcloud.service.MyStandardClient;
import com.karen.standardtestcloud.service.StandardTestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StandardController {


    @Autowired(required = false)
    private StandardTestClient standardTestClient;

    @Autowired(required = false)
    private MyStandardClient myStandardClient;

    //查询国家标准
    @RequestMapping("/querystandardlist_result")
    public @ResponseBody
//    void querystandard_result() throws Exception {
//        StandardQueryVo standardQueryVo= new StandardQueryVo();
//        StandardlistCustom slc = new StandardlistCustom();
//        slc.setSid("GB/T 31466-2015");
//        PageQuery pageQuery = new PageQuery(1,10);
//        standardQueryVo.setPageQuery(pageQuery);
//        standardQueryVo.setStandardlistCustom(slc);
//        ArrayList<StandardlistCustom> list = standardTestClient.findStandardList(standardQueryVo);
////        for(StandardlistCustom o : list){
////            System.out.println(o.getSname());
////        }
////        StandardlistCustom sc = list.get(0);
////        System.out.println(sc.getSname());
//        //以上方法会报错 java.util.LinkedHashMap cannot be cast to XXX
//
//        ArrayList<StandardlistCustom> list2 = new Gson().fromJson(new Gson().toJson(list), new TypeToken<ArrayList<StandardlistCustom>>(){}.getType());
//        System.out.println(list);
//        for(StandardlistCustom o : list2){
//            System.out.println(o.getSname());
//
//        }
//    }
    DataGridResultInfo querystandard_result(StandardQueryVo standardQueryVo,
                                            Integer rows, Integer page) throws Exception {
        // 非空校验
        standardQueryVo = standardQueryVo != null ? standardQueryVo
                : new StandardQueryVo();
        // 获取 standardCustom
        StandardlistCustom standardlistCustom = standardQueryVo.getStandardlistCustom();
        // 非空 校验
        standardlistCustom = standardlistCustom != null ? standardlistCustom
                : new StandardlistCustom();
        //分页支持
        PageQuery pageQuery = new PageQuery(page, rows);
        standardQueryVo.setPageQuery(pageQuery);
        // 分页查询，向sysuserQueryVo中传入pageQuery
        System.out.println(standardQueryVo.getStandardlistCustom());
        ArrayList<StandardlistCustom> list = standardTestClient.findStandardList(standardQueryVo);
        PageInfo<StandardlistCustom> pageInfo = new PageInfo<>(list);
        int total = (int) pageInfo.getTotal();
        DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
        // 填充 total
        dataGridResultInfo.setTotal(total);
        // 填充 rows
        dataGridResultInfo.setRows(list);
        return dataGridResultInfo;
    }

    //查询自定义标准
    @RequestMapping("/mystandard_result")
    public @ResponseBody
    DataGridResultInfo mystandard_result(StandardQueryVo standardQueryVo,
                                         Integer rows, Integer page) throws Exception {
        System.out.println("11111111111111111111111111111111");
        // 非空校验
        standardQueryVo = standardQueryVo != null ? standardQueryVo
                : new StandardQueryVo();
        // 获取 standardCustom
        StandardresultCustom standardresultCustom = standardQueryVo.getStandardresultCustom();
        // 非空 校验
        standardresultCustom = standardresultCustom != null ? standardresultCustom
                : new StandardresultCustom();
        //分页支持
        PageQuery pageQuery = new PageQuery(page, rows);
        standardQueryVo.setPageQuery(pageQuery);
        // 分页查询
        System.out.println(standardQueryVo.getStandardresultCustom());
        ArrayList<StandardresultCustom> list = myStandardClient.findMyStandard(standardQueryVo);
        PageInfo<StandardresultCustom> pageInfo = new PageInfo<>(list);
        int total = (int) pageInfo.getTotal();
        DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
        // 填充 total
        dataGridResultInfo.setTotal(total);
        // 填充 rows
        dataGridResultInfo.setRows(list);
        return dataGridResultInfo;
    }

}
