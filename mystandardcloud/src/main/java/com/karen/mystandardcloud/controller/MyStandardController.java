package com.karen.mystandardcloud.controller;
import com.karen.mystandardcloud.po.StandardQueryVo;
import com.karen.mystandardcloud.service.MyStandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
/**
 * @author LIKE
 * @date 2019/6/25 10:25
 */
@RestController
public class MyStandardController {

    @Autowired
    private MyStandardService myStandardService;
    @RequestMapping("/mystandard_result")
    @ResponseBody
    public ArrayList findMyStandard(@RequestBody StandardQueryVo standardQueryVo) throws Exception {
        System.out.println("1111111111111111111111111");
        return myStandardService.findMyStandard(standardQueryVo);
    }
}
