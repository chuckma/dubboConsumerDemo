package com.light.dubbo.service.impl;

import com.light.dubbo.service.HelloService;

public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello," + name;
    }
}
