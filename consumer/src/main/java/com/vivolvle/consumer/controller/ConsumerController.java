package com.vivolvle.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: weilz
 * @Date: 2019/5/14 16:10
 */
@RestController
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getMsg")
    public String getMsg(){
        String response = restTemplate.getForEntity("http://PRODUCER/msg", String.class).getBody();
        System.out.println(response);
        return "get message";
    }
}
