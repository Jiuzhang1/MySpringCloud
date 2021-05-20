package com.monster.serviceribbon.controller;

import com.monster.serviceribbon.sevice.impl.HelloServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {
    private static final Logger logger = LoggerFactory.getLogger(HelloControler.class);
    @Autowired
    HelloServiceImpl helloService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloService.sayHi(name);
    }
}

