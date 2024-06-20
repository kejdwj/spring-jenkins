package com.luoy.springjenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author luo
 * @Data 2024/6/20 下午3:36
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/get")
    public String get(){
        return "hello";
    }
}
