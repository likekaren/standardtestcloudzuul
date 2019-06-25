package com.karen.standardtestcloud.controller;

import com.karen.standardtestcloud.po.ActiveUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {
    @RequestMapping("/first")
    public String first(Model model) throws Exception {
//        //从shiro的session中取activeUser
//        Subject subject = SecurityUtils.getSubject();
//        // 取身份信息
//        ActiveUser activeUser = (ActiveUser) subject.getPrincipal();
//        // 通过model传到页面
//        model.addAttribute("activeUser", activeUser);
        return "/base/first";
    }

    @RequestMapping("/menu")
    public String menu()throws Exception{
        return "/base/menu";
    }
}
