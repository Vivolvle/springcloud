package com.vivolvle.producer.mapper;

import com.vivolvle.producer.model.MapStage;

public interface MapStageMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MapStage record);

    int insertSelective(MapStage record);

    MapStage selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MapStage record);

    int updateByPrimaryKey(MapStage record);
}