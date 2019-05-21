package com.vivolvle.producer.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @Author: weilz
 * @Date: 2019/5/20 17:51
 */
public interface StreamClient {

    @Input("myMessage")
    SubscribableChannel input();

    @Output("myMessage")
    MessageChannel output();
}
