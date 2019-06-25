package com.karen.standardtestcloud.service;

import com.karen.standardtestcloud.po.StandardQueryVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@FeignClient("eureka-client-zuul")
public interface DataClient {
    @GetMapping("/mystandard/mystandard_result")
    ArrayList findMyStandard(StandardQueryVo standardQueryVo) throws Exception;
    @GetMapping("/standardservice/querystandardlist_result")
    ArrayList findStandardList(StandardQueryVo standardQueryVo) throws Exception;
}
