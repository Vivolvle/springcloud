package com.vivolvle.producer.model;

import java.util.Date;

public class MapStudent {
    private Long id;

    private Long mapId;

    private Long instituteId;

    private Long userId;

    private Byte passSum;

    private Integer learnSum;

    private Integer pointSum;

    private String latestCourse;

    private Long createId;

    private Date createDate;

    private Date updateDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMapId() {
        return mapId;
    }

    public void setMapId(Long mapId) {
        this.mapId = mapId;
    }

    public Long getInstituteId() {
        return instituteId;
    }

    public void setInstituteId(Long instituteId) {
        this.instituteId = instituteId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Byte getPassSum() {
        return passSum;
    }

    public void setPassSum(Byte passSum) {
        this.passSum = passSum;
    }

    public Integer getLearnSum() {
        return learnSum;
    }

    public void setLearnSum(Integer learnSum) {
        this.learnSum = learnSum;
    }

    public Integer getPointSum() {
        return pointSum;
    }

    public void setPointSum(Integer pointSum) {
        this.pointSum = pointSum;
    }

    public String getLatestCourse() {
        return latestCourse;
    }

    public void setLatestCourse(String latestCourse) {
        this.latestCourse = latestCourse == null ? null : latestCourse.trim();
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