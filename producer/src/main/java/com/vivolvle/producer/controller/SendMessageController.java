package com.vivolvle.producer.controller;

import com.vivolvle.producer.message.StreamClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Author: weilz
 * @Date: 2019/5/20 17:59
 */
@RestController
public class SendMessageController {
    @Autowired
    private StreamClient streamClient;

    @GetMapping("/sendMessage")
    public void process() {
        streamClient.output().send(MessageBuilder.withPayload("now " + new Date()).build());
    }
}
