package com.vivolvle.producer.controller;

import com.vivolvle.producer.model.MapTheme;
import com.vivolvle.producer.service.MapThemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: weilz
 * @Date: 2019/5/14 16:10
 */
@RestController
@RefreshScope
public class ProducerController {
    @Autowired
    private MapThemeService mapThemeService;
    @Value("${env1}")
    private String env1;

    @GetMapping("/msg")
    public String msg(){
        return env1;
    }

    @GetMapping("/list")
    public List<MapTheme> getList(){
        return mapThemeService.getList();
    }
}
