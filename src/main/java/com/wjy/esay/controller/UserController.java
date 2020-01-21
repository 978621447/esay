package com.wjy.esay.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WangJinYi 2020/1/21
 */
@RequestMapping("/user")
@RestController
public class UserController {

    @GetMapping("/test")
    public String test() {
        return "success";
    }
}
