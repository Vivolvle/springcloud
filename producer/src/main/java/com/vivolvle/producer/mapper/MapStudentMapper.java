package com.vivolvle.producer.mapper;

import com.vivolvle.producer.model.MapStudent;

public interface MapStudentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MapStudent record);

    int insertSelective(MapStudent record);

    MapStudent selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MapStudent record);

    int updateByPrimaryKey(MapStudent record);
}