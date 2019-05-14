package com.vivolvle.producer.mapper;

import com.vivolvle.producer.model.Map;

public interface MapMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Map record);

    int insertSelective(Map record);

    Map selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Map record);

    int updateByPrimaryKey(Map record);
}