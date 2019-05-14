package com.vivolvle.producer.mapper;

import com.vivolvle.producer.model.MapTheme;

import java.util.List;

public interface MapThemeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MapTheme record);

    int insertSelective(MapTheme record);

    MapTheme selectByPrimaryKey(Long id);

    List<MapTheme> getList();

    int updateByPrimaryKeySelective(MapTheme record);

    int updateByPrimaryKey(MapTheme record);
}