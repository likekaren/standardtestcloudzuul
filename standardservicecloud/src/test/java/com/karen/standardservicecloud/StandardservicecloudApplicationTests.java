package com.karen.standardservicecloud;

import com.karen.standardservicecloud.mapper.StandardlistMapperCustom;
import com.karen.standardservicecloud.po.Standardlist;
import com.karen.standardservicecloud.po.StandardlistCustom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

@RunWith(SpringRunner.class)
@MapperScan("com.karen.standardservicecloud.mybatis")
@SpringBootTest

public class StandardservicecloudApplicationTests {

    @Autowired(required = false)
    StandardlistMapperCustom standardlistMapperCustom;
    @Autowired(required = false)
    Standardlist standardlist;
    @Test
    public void contextLoads() {
        
    }
    @Test
    public void testsp(){
        System.out.println("1111111111111");
    }

    @Test
    public void testmybatis() throws Exception {
        String str = "GB/T 31466-2015";
        ArrayList<StandardlistCustom> list = standardlistMapperCustom.findStandardStr(str);
//        for(StandardlistCustom standardlistCustom:list){
//            System.out.println(standardlistCustom.toString());
//        }
//        for (int i = 0; i <list.size() ; i++) {
//            System.out.println(list.get(i).toString());
//        }
        Standardlist sc = list.get(0);
        //这里采用子类调用父类的toString来进行打印，不然没有内容。super.toString();
        System.out.println(sc.toString());

    }
}
