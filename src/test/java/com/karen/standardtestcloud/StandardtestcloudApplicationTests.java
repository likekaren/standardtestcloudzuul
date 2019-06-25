package com.karen.standardtestcloud;

import com.karen.standardtestcloud.po.PageQuery;
import com.karen.standardtestcloud.po.StandardQueryVo;
import com.karen.standardtestcloud.po.StandardlistCustom;
import com.karen.standardtestcloud.service.StandardTestClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableDiscoveryClient
@EnableFeignClients
public class StandardtestcloudApplicationTests {

    @Autowired(required = false)
    private StandardTestClient standardTestClient;
    @Test
    public void contextLoads() {
        System.out.println("1111111111111");
    }

//    @Test
//    public void test() throws Exception{
//        StandardQueryVo svo = new StandardQueryVo();
//        StandardlistCustom slc = new StandardlistCustom();
////        slc.setSid("GB/T 31466-2015");
//        svo.setStandardlistCustom(slc);
//
//        List list = standardTestClient.findStandardList(svo);
//        for(Object o : list){
//            System.out.println(o);
//        }
//    }
    @Test
    public void querystandard_result() throws Exception {
//        StandardQueryVo standardQueryVo= new StandardQueryVo();
//        StandardlistCustom slc = new StandardlistCustom();
//        slc.setSid("GB/T 31466-2015");
//        PageQuery pageQuery = new PageQuery(1,10);
//        standardQueryVo.setPageQuery(pageQuery);
//        standardQueryVo.setStandardlistCustom(slc);
//
//        List list = standardTestClient.findStandardList(standardQueryVo);
//        for(Object o : list){
//            System.out.println(o);
//        }
        System.out.println("test");
    }
    @Test
    public void testsp(){
        System.out.println("1111111111111");
    }

}
