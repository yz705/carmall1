package com.ytc.controller;

import com.ytc.model.Order;
import com.ytc.model.Province;
import com.ytc.service.OrderService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    @Autowired
    private OrderService orderService;

    @RequestMapping("/top")
    public String top(){
        return "suser/frame/top";
    }

    @RequestMapping("center")
    public String center(){
        return "suser/frame/center";
    }

    @RequestMapping("left")
    public String left(){
        return "suser/frame/left";
    }
    @RequestMapping("test")
    public String test(){
        return "suser/order/suserShow";
    }

    @RequestMapping("toQueryShow")
    public String toQueryShow(){
        return "suser/order/toQueryShow";
    }

    @RequestMapping("/select")
    public String select(Model m){
      List<Order> list=orderService.select();
        System.out.println(list);
        m.addAttribute("list",list);
        return "orderShow";
    }


//    @RequestMapping("selectProvince")
//    @ResponseBody
//    public List<Province> selectProvince(){
//        OrderController provinceService;
//        List<Province> list=provinceService.selectProvince();
//        return list;
//    }

}