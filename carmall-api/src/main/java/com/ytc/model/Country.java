package com.ytc.model;

import java.io.Serializable;

public class Country implements Serializable {
    private Integer coid;

    private String countryname;

    public Integer getCoid() {
        return coid;
    }

    public void setCoid(Integer coid) {
        this.coid = coid;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname == null ? null : countryname.trim();
    }

    @Override
    public String toString() {
        return "Country{" +
                "coid=" + coid +
                ", countryname='" + countryname + '\'' +
                '}';
    }
}