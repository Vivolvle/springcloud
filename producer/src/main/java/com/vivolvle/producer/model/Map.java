package com.vivolvle.producer.model;

import java.util.Date;

public class Map {
    private Long id;

    private Long instituteId;

    private Long resourceId;

    private Long themeId;

    private String name;

    private String brief;

    private Byte timeUsed;

    private Date startTime;

    private Date endTime;

    private Long catagoryId;

    private Byte status;

    private Byte follow;

    private Byte collect;

    private Byte followOrder;

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

    public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    public Long getThemeId() {
        return themeId;
    }

    public void setThemeId(Long themeId) {
        this.themeId = themeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief == null ? null : brief.trim();
    }

    public Byte getTimeUsed() {
        return timeUsed;
    }

    public void setTimeUsed(Byte timeUsed) {
        this.timeUsed = timeUsed;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Long getCatagoryId() {
        return catagoryId;
    }

    public void setCatagoryId(Long catagoryId) {
        this.catagoryId = catagoryId;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getFollow() {
        return follow;
    }

    public void setFollow(Byte follow) {
        this.follow = follow;
    }

    public Byte getCollect() {
        return collect;
    }

    public void setCollect(Byte collect) {
        this.collect = collect;
    }

    public Byte getFollowOrder() {
        return followOrder;
    }

    public void setFollowOrder(Byte followOrder) {
        this.followOrder = followOrder;
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