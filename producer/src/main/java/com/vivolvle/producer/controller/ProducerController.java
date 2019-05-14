package com.vivolvle.producer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: weilz
 * @Date: 2019/5/14 16:10
 */
@RestController
public class ProducerController {

    @GetMapping("/msg")
    public String msg(){
        return "hello_world";
    }
}
