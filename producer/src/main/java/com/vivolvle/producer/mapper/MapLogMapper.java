package com.vivolvle.producer.mapper;

import com.vivolvle.producer.model.MapLog;

public interface MapLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MapLog record);

    int insertSelective(MapLog record);

    MapLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MapLog record);

    int updateByPrimaryKey(MapLog record);
}