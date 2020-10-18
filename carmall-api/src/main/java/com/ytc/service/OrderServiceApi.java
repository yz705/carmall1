package com.ytc.service;


import com.ytc.model.Order;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public interface OrderServiceApi {
    @RequestMapping("/queryOrder")
    List<Order> select();

    @RequestMapping("/queryOrder")
    Order selectOrder(Integer address1);
}
