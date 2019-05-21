package com.vivolvle.producer.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

/**
 * @Author: weilz
 * @Date: 2019/5/20 17:56
 */
@Component
@EnableBinding(StreamClient.class)
@Slf4j
public class StreamReceiver {

    @StreamListener("input")
    @SendTo("output")
    public Object processInput(Object message){
        log.info("StreamInputReceiver: {}", message);
        return message;
    }

    @StreamListener("output")
    @SendTo("output1")
    public String processOutput(Object message) {
        log.info("StreamOutputReceiver: {}", message);
        return "helloWorld";
    }

    @StreamListener("output1")
    public void processOutput1(String message){
        log.info("StreamOutput1Receiver: {}", message);
    }
}
