package com.ytc.model;

import java.io.Serializable;

public class Quantry implements Serializable {
    private Integer quid;

    private String quname;

    public Integer getQuid() {
        return quid;
    }

    public void setQuid(Integer quid) {
        this.quid = quid;
    }

    public String getQuname() {
        return quname;
    }

    public void setQuname(String quname) {
        this.quname = quname == null ? null : quname.trim();
    }

    @Override
    public String toString() {
        return "Quantry{" +
                "quid=" + quid +
                ", quname='" + quname + '\'' +
                '}';
    }
}