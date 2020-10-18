package com.ytc.model;

import java.io.Serializable;

public class CartItem implements Serializable {
    //书+数量+小计
    private Product product;
    private Integer count;
    private Double subtotal;


    @Override
    public String toString() {
        return "CartItem{" +
                "product=" + product +
                ", count=" + count +
                ", subtotal=" + subtotal +
                '}';
    }

    public CartItem(Product product, Integer count, Double subtotal) {
        this.product = product;
        this.count = count;
        this.subtotal = subtotal;
    }

    public CartItem() {
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }
}
