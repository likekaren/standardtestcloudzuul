package com.karen.standardservicecloud.controller;

import com.karen.standardservicecloud.po.StandardQueryVo;

import com.karen.standardservicecloud.service.StandardCloudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class StandardCloudController {
    @Autowired
    private StandardCloudService standardCloudService;

    @RequestMapping("/querystandardlist_result")
    @ResponseBody
    public ArrayList findStandardList(@RequestBody StandardQueryVo standardQueryVo) throws Exception {
        return standardCloudService.findStandardList(standardQueryVo);
    }





}
