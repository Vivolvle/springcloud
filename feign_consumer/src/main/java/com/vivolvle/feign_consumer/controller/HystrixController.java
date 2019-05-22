package com.vivolvle.feign_consumer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author weilz
 * @date 2019/5/22
 */
@RestController
@DefaultProperties(defaultFallback = "defaultFallBack")
public class HystrixController {

    /**
     * 目标服务的调用失败，或者本身出现异常
     * HystrixCommand如果后面不指定fallbackMethod,则使用默认的fallBack
     * 服务降级
     *
     * @return
     */
    @HystrixCommand
//    @HystrixCommand(commandProperties = {
//            //默认超时时间为1s，所以需要自己去修改，不然都降级去了
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "4000")
//    })
//    @HystrixCommand(commandProperties = {
//            //设置熔断
//            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),
//            //滚动时间窗口的最小请求数
//            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),
//            //时间窗，10s，过了十秒变成半开状态
//            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"),
//            //滚动时间窗口的变成短路的百分比，也就是失败七次
//            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60")
//    })
    @GetMapping("/getMapList")
    public String getMapThemeList(@RequestParam("number") Integer number) {
        if (number % 2 == 0) {
            return "success";
        }
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForEntity("http://localhost:8080/list", String.class).getBody();
    }

    private String fallBack() {
        return "太拥挤了，请稍后再试";
    }

    private String defaultFallBack() {
        return "默认太拥挤了，请稍后再试";
    }
}
