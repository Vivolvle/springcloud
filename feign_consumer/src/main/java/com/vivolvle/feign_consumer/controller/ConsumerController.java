package com.vivolvle.feign_consumer.controller;

import com.vivolvle.feign_consumer.config.ProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: weilz
 * @Date: 2019/5/14 17:10
 */
@RestController
public class ConsumerController {
    @Autowired
    private ProductClient productClient;

    @GetMapping("/getMsg")
    public String getMsg(){
        String response = productClient.productMsg();
        System.out.println(response);
        return "get message";
    }
}
