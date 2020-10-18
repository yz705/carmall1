package com.ytc.model;

import java.io.Serializable;

public class Product implements Serializable {
    private Integer id;
    private String productName;
    private Double price;
    private String picPath;
    private String discription;

    public Product(Integer id, String productName, Double price, String picPath, String discription) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.picPath = picPath;
        this.discription = discription;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", picPath='" + picPath + '\'' +
                ", discription='" + discription + '\'' +
                '}';
    }

    public Product() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }
}
