package com.ytc.controller;

import com.ytc.model.Order;
import com.ytc.service.OrderService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author yaozheng
 * @create 2020/10/9
 * @since 1.0.0
 */
@Controller
@RequestMapping("/order")
public class OrderController {
    @Reference
    private OrderService orderService;

    @RequestMapping("top")
    public String top(){
        return "suser/frame/top.html";
    }

    @RequestMapping("center")
    public String center(){
        return "suser/frame/center.html";
    }

    @RequestMapping("left")
    public String left(){
        return "suser/frame/left.html";
    }
    @RequestMapping("test")
    public String test(){
        return "suser/order/suserShow.html";
    }

    @RequestMapping("toQueryShow")
    public String toQueryShow(){
        return "suser/order/toQueryShow.html";
    }


    @RequestMapping("select")
    public String select(Model m,Order o,Integer valname,String whatname,Integer address,Integer address1,Integer address2){
        String str = "";
        if (address1!=null){
        
        }
        List<Order>list=orderService.select();
        return "suser/orderShow.html";
    }
}