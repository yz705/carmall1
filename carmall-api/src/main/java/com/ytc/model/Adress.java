package com.ytc.model;

import java.io.Serializable;

public class Adress implements Serializable {
    private Integer aid;

    private Integer userId;

    private String consignee;

    private Areainfo province;

    private Areainfo city;

    private Areainfo district;

    private String street;

    private String phone;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    public Areainfo getProvince() {
        return province;
    }

    public void setProvince(Areainfo province) {
        this.province = province;
    }

    public Areainfo getCity() {
        return city;
    }

    public void setCity(Areainfo city) {
        this.city = city;
    }

    public Areainfo getDistrict() {
        return district;
    }

    public void setDistrict(Areainfo district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street == null ? null : street.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    @Override
    public String toString() {
        return "Adress{" +
                "aid=" + aid +
                ", userId=" + userId +
                ", consignee='" + consignee + '\'' +
                ", province=" + province +
                ", city=" + city +
                ", district=" + district +
                ", street='" + street + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}