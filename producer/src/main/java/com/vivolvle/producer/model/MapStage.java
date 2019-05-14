package com.vivolvle.producer.model;

import java.util.Date;

public class MapStage {
    private Long id;

    private Long instituteId;

    private Long mapId;

    private String name;

    private Byte followOrder;

    private Byte scoreUsed;

    private Integer score;

    private Byte orderIndex;

    private Long createId;

    private Date createDate;

    private Date updateDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getInstituteId() {
        return instituteId;
    }

    public void setInstituteId(Long instituteId) {
        this.instituteId = instituteId;
    }

    public Long getMapId() {
        return mapId;
    }

    public void setMapId(Long mapId) {
        this.mapId = mapId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Byte getFollowOrder() {
        return followOrder;
    }

    public void setFollowOrder(Byte followOrder) {
        this.followOrder = followOrder;
    }

    public Byte getScoreUsed() {
        return scoreUsed;
    }

    public void setScoreUsed(Byte scoreUsed) {
        this.scoreUsed = scoreUsed;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Byte getOrderIndex() {
        return orderIndex;
    }

    public void setOrderIndex(Byte orderIndex) {
        this.orderIndex = orderIndex;
    }

    public Long getCreateId() {
        return createId;
    }

    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}