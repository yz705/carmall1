package com.ytc.model;

import java.io.Serializable;

public class Pinpai implements Serializable {
    private Integer pid;

    private String pname;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    @Override
    public String toString() {
        return "Pinpai{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                '}';
    }
}