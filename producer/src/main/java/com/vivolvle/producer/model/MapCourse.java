package com.vivolvle.producer.model;

import java.util.Date;

public class MapCourse {
    private Long id;

    private Long instituteId;

    private Long mapId;

    private Long stageId;

    private Byte type;

    private Byte needLearn;

    private Byte scoreUsed;

    private Integer score;

    private Byte orderIndex;

    private Integer timeCost;

    private Integer exameTimes;

    private Long userId;

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

    public Long getStageId() {
        return stageId;
    }

    public void setStageId(Long stageId) {
        this.stageId = stageId;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Byte getNeedLearn() {
        return needLearn;
    }

    public void setNeedLearn(Byte needLearn) {
        this.needLearn = needLearn;
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

    public Integer getTimeCost() {
        return timeCost;
    }

    public void setTimeCost(Integer timeCost) {
        this.timeCost = timeCost;
    }

    public Integer getExameTimes() {
        return exameTimes;
    }

    public void setExameTimes(Integer exameTimes) {
        this.exameTimes = exameTimes;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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