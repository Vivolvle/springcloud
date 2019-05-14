package com.vivolvle.producer.service.impl;

import com.vivolvle.producer.mapper.MapThemeMapper;
import com.vivolvle.producer.model.MapTheme;
import com.vivolvle.producer.service.MapThemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: weilz
 * @Date: 2019/5/14 18:43
 */
@Service
public class MapThemeServiceImpl implements MapThemeService {
    @Autowired
    private MapThemeMapper mapThemeMapper;
    @Override
    public List<MapTheme> getList() {
        return mapThemeMapper.getList();
    }
}
