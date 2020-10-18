package com.ytc.service;

import com.ytc.model.Car;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 * USER:gso
 * CLASSNAME: carmall
 * DATE: 2020/10/13
 * TIME: 16:50
 * JDK 1.8
 */
public interface CarServiceApi {

    @RequestMapping("/queryCarList")
    List<Car> queryCarList();



    @RequestMapping("/delCar")
    void delCar(@RequestParam("id") Integer id);

    @RequestMapping("/updateCar")
    void updateCar(@RequestBody Car car);

    @RequestMapping("/addCar")
    void addCar(@RequestBody Car car);
    @RequestMapping("/toUpdateCar")
    Car toUpdateCar(@RequestParam("id") Integer id);
}
