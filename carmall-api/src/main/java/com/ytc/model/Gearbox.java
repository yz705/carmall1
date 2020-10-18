package com.ytc.model;

import java.io.Serializable;

public class Gearbox implements Serializable {
    private Integer geid;

    private String gename;

    public Integer getGeid() {
        return geid;
    }

    public void setGeid(Integer geid) {
        this.geid = geid;
    }

    public String getGename() {
        return gename;
    }

    public void setGename(String gename) {
        this.gename = gename == null ? null : gename.trim();
    }

    @Override
    public String toString() {
        return "Gearbox{" +
                "geid=" + geid +
                ", gename='" + gename + '\'' +
                '}';
    }
}