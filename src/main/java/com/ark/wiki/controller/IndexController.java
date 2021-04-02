package com.ark.wiki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    /**
     * 首页
     * @return
     */
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/home-2.html")
    public String home2() {
        return "home-2";
    }
}
