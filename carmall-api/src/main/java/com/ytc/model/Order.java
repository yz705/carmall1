package com.ytc.model;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {
    /*private static final long ordernumber = */
   /* private static final long ordernumber = -903589261972255366L;*/
    private Integer oid;

    private Date ordertime;

    private String ordership;

    private Integer state;

    private String address;

    private String name;

    private String telephone;

    private String ordernumber;

    private String ordersheng;

    private String ordershi;

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

    public String getOrdership() {
        return ordership;
    }

    public void setOrdership(String ordership) {
        this.ordership = ordership;
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

    public String getOrdersheng() {
        return ordersheng;
    }

    public void setOrdersheng(String ordersheng) {
        this.ordersheng = ordersheng;
    }

    public String getOrdershi() {
        return ordershi;
    }

    public void setOrdershi(String ordershi) {
        this.ordershi = ordershi;
    }

    @Override
    public String toString() {
        return "Order{" +
                "oid=" + oid +
                ", ordertime=" + ordertime +
                ", ordership='" + ordership + '\'' +
                ", state=" + state +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", telephone='" + telephone + '\'' +
                ", ordernumber='" + ordernumber + '\'' +
                ", ordersheng='" + ordersheng + '\'' +
                ", ordershi='" + ordershi + '\'' +
                '}';
    }

    public Order() {
    }
}