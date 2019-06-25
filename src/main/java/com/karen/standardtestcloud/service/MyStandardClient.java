package com.karen.standardtestcloud.service;

import com.karen.standardtestcloud.po.StandardQueryVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@FeignClient("mystandardcloud-eureka")
public interface MyStandardClient {
    @GetMapping("/mystandard_result")
    ArrayList findMyStandard(StandardQueryVo standardQueryVo) throws Exception;
}
