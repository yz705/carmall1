package com.ytc.model;

import java.io.Serializable;

public class Dive implements Serializable {
    private Integer did;

    private String dname;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }

    @Override
    public String toString() {
        return "Dive{" +
                "did=" + did +
                ", dname='" + dname + '\'' +
                '}';
    }
}