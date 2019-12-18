package com.zj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuickController {
	@RequestMapping("/hello")
	@ResponseBody
    public String hello() {
    	return "hello SpringBoot";
    }
}
