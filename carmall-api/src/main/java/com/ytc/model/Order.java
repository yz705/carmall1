package com.ytc.model;

import java.util.Date;

public class Order {
    private Integer oid;

    private Date ordertime;

    private Double todal;

    private Integer state;

    private String address;

    private String name;

    private String telephone;

    private String ordernumber;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public Double getTodal() {
        return todal;
    }

    public void setTodal(Double todal) {
        this.todal = todal;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber;
    }

    @Override
    public String toString() {
        return "Order{" +
                "oid=" + oid +
                ", ordertime=" + ordertime +
                ", todal=" + todal +
                ", state=" + state +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", telephone='" + telephone + '\'' +
                ", ordernumber='" + ordernumber + '\'' +
                '}';
    }


}