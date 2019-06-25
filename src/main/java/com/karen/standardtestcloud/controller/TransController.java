package com.karen.standardtestcloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TransController {
    @RequestMapping("/querystandardList")
    public String querystandardlist() throws Exception {
        return "/standardList";
    }
    @RequestMapping("/querycarjsz")
    public String querycarjsz() throws Exception {
        return "/querycarjsz";
    }
    @RequestMapping("/querycarxsz")
    public String querycarjxz() throws Exception {
        return "/querycarxsz";
    }
    @RequestMapping("/querycarjsz1")
    public String querycarjsz1() throws Exception {
        return "/querycarjsz";
    }
    @RequestMapping("/querycarxsz1")
    public String querycarjxz1() throws Exception {
        return "/querycarxsz";
    }
    @RequestMapping("/userqueryyeart")
    public String userqueryyeart() throws Exception {
        return "/userqueryyeart";
    }
    @RequestMapping("/queryfb")
    public String queryfb() throws Exception {
        return "/queryfb";
    }
    @RequestMapping("/getjsz")
    public String getjsz() throws Exception {
        return "/getjsz";
    }
    @RequestMapping("/getxsz")
    public String getxsz() throws Exception {
        return "/getxsz";
    }
    @RequestMapping("/querymystandard")
    public String querymystandard() throws Exception {
        return "/mystandard";
    }
    @RequestMapping("/makecaruser")
    public String makecaruser() throws Exception {
        return "/makecaruser";
    }
    @RequestMapping("/yeartest")
    public String yeartest() throws Exception {
        return "/yeartest";
    }
    @RequestMapping("/queryyeart")
    public String queryyeart() throws Exception {
        return "/queryyeart";
    }
    @RequestMapping("/submitcgs")
    public String submitcgs() throws Exception {
        return "/submitcgs";
    }
    @RequestMapping("/opencgs")
    public String opencgs() throws Exception {
        return "/opencgs";
    }
    @RequestMapping("/qxcaruser")
    public String qxcaruser() throws Exception {
        return "/qxcaruser";
    }
}
