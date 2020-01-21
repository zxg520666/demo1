package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhangxiaoguang
 * @create 2020-01-21 11:03
 */
@Controller
public class TestController {
    @RequestMapping("index")
    public String index(){
        return "index";

    }
}
