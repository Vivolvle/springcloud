package com.vivolvle.feign_consumer.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: weilz
 * @Date: 2019/5/14 17:06
 */
@FeignClient(name = "producer")
public interface ProductClient {
    @GetMapping("/msg")
    String productMsg();
}
