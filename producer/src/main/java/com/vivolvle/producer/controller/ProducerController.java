package com.vivolvle.producer.controller;

import com.vivolvle.producer.model.MapTheme;
import com.vivolvle.producer.service.MapThemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: weilz
 * @Date: 2019/5/14 16:10
 */
@RestController
public class ProducerController {
    @Autowired
    private MapThemeService mapThemeService;

    @GetMapping("/msg")
    public String msg(){
        return "hello_world";
    }

    @GetMapping("/list")
    public List<MapTheme> getList(){
        return mapThemeService.getList();
    }
}
