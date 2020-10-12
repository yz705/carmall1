package com.ytc.service;

import com.ytc.model.Order;

import java.util.List;

public interface OrderService {
    List<Order> queryOrderList();

    List<Order> select();
}
