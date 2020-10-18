package com.ytc.model;

import java.io.Serializable;

public class Energy implements Serializable {
    private Integer enid;

    private String enname;

    public Integer getEnid() {
        return enid;
    }

    public void setEnid(Integer enid) {
        this.enid = enid;
    }

    public String getEnname() {
        return enname;
    }

    public void setEnname(String enname) {
        this.enname = enname == null ? null : enname.trim();
    }

    @Override
    public String toString() {
        return "Energy{" +
                "enid=" + enid +
                ", enname='" + enname + '\'' +
                '}';
    }
}