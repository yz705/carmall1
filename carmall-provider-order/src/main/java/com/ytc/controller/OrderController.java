package com.ytc.controller;

import com.ytc.mapper.OrderMapper;
import com.ytc.model.Order;
import com.ytc.service.OrderServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author yaozheng
 * @create 2020/10/13
 * @since 1.0.0
 */
@Controller
public class OrderController implements OrderServiceApi {
    @Autowired
    private OrderMapper orderMapper;


    @RequestMapping("/select")
    public List<Order> select() {
        List<Order> orders = orderMapper.select();
        return orders;
    }
}