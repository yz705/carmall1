package com.ytc.model;

import java.io.Serializable;

public class Areainfo implements Serializable {
    private Integer id;

    private String areaId;

    private String areaName;

    private String parentId;

    private Integer grade;

    @Override
    public String toString() {
        return "Areainfo{" +
                "id=" + id +
                ", areaId='" + areaId + '\'' +
                ", areaName='" + areaName + '\'' +
                ", parentId='" + parentId + '\'' +
                ", grade=" + grade +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId == null ? null : areaId.trim();
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}