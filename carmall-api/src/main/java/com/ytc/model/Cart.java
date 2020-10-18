package com.ytc.model;

import java.io.Serializable;
import java.util.Map;

public class Cart implements Serializable {
    private Map<Integer,CartItem> cartMap;
    private Double totalPrice;

    public Map<Integer, CartItem> getCartMap() {
        return cartMap;
    }

    public void setCartMap(Map<Integer, CartItem> cartMap) {
        this.cartMap = cartMap;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cartMap=" + cartMap +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
