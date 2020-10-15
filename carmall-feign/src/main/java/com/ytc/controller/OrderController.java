package com.ytc.controller;

import com.ytc.model.Order;
import com.ytc.model.Province;
import com.ytc.service.OrderService;
import com.ytc.service.ProvinceService;
import com.ytc.service.ProvinceServiceApi;
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

    @Autowired
    private ProvinceService provinceService;

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

    @RequestMapping("selectProvince")
    @ResponseBody
    public List<Province> selectProvince(){
        List<Province> list=provinceService.selectProvince();
        return list;
    }

    @RequestMapping("/queryOrder")
    public String select(Model m,Order o,Integer valuename,String whatname,Integer address,Integer address1,Integer address2) {

        String str = "";

        if (address1!=null){
            o = orderService.selectOrder(address1);
            str+=o.getOrdersheng();
        }

        if (address2!=null){
            o = orderService.selectOrder(address2);
            str+=o.getOrdershi();
        }
        if (valuename==1){

        }else if (valuename==2){
            o.setTelephone(whatname);
        }else if (valuename==3){

        }
        List<Order> list = orderService.select();
        m.addAttribute("list", list);
        return "orderShow";
    }


}