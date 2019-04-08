package com.gree.drools.controller;

import com.gree.drools.service.DroolsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private DroolsService droolsService;

    @GetMapping("/showRules")
    public String showRules(){
        return droolsService.fireRule();
    }
    @GetMapping("/testBoot")
    public String testBoot(){
        return "123456";
    }
}
