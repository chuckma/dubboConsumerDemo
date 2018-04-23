package com.light.dubbo.controller;


import com.light.dubbo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @Autowired
    private HelloService helloService;

    @RequestMapping("hello")
    @ResponseBody
    public String hello(String name) {
        return this.helloService.sayHello(name);
    }
}
