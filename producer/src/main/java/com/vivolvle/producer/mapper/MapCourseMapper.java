package com.vivolvle.producer.mapper;

import com.vivolvle.producer.model.MapCourse;

public interface MapCourseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MapCourse record);

    int insertSelective(MapCourse record);

    MapCourse selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MapCourse record);

    int updateByPrimaryKey(MapCourse record);
}