package com.thounisoft.vote.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhanghongyun on 2018/8/26.
 */

@RestController
public class Hello {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello() {
        return "hello springBoot";
    }
}
