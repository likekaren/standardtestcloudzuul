package com.karen.standardtestcloud.service;

import com.karen.standardtestcloud.po.StandardQueryVo;
import com.karen.standardtestcloud.po.StandardlistCustom;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import sun.awt.SunHints;

import java.util.ArrayList;
import java.util.List;

@FeignClient("standardservicecloud-eureka")
public interface StandardTestClient {

//    @RequestMapping(value="/querystandardlist_result",method = RequestMethod.POST)
    @GetMapping("/querystandardlist_result")
    ArrayList findStandardList(StandardQueryVo standardQueryVo) throws Exception;

}
