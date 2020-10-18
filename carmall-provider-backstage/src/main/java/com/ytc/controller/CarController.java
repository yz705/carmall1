package com.ytc.controller;

import com.ytc.mapper.*;
import com.ytc.model.Car;
import com.ytc.service.CarServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
 * TIME: 17:05
 * JDK 1.8
 */

@Controller
public class CarController implements CarServiceApi {

    @Autowired
    private CarMapper carMapper;

    @Autowired
    private CountryMapper countryMapper;

    @Autowired
    private DiveMapper diveMapper;

    @Autowired
    private EnergyMapper energyMapper;

    @Autowired
    private GearboxMapper gearboxMapper;

    @Autowired
    private PinpaiMapper pinpaiMapper;

    @Autowired
    private QuantryMapper quantryMapper;

//    @RequestMapping("/queryCarList")
//    public String queryCarList(Model model){
//        List<Car> list =carMapper.queryCarList();
//        model.addAttribute("list",list);
//        return "list";
//    }


    @RequestMapping("/queryCarList")
    @ResponseBody
    public List<Car> queryCarList() {
        System.out.println(1);
        List<Car> list =carMapper.queryCarList();
        System.out.println(list);
        return list;
    }

    @RequestMapping("toUpdateCar")
    @ResponseBody
    public Car toUpdateCar(@RequestParam("id") Integer id) {
        Car car = carMapper.toUpdateCar(id);
        return car;
    }

    @RequestMapping("delCar")
    @ResponseBody
    public void delCar(@RequestParam("id") Integer id) {

        carMapper.delCar(id);
    }

//    @RequestMapping("toUpdateCar")
//    @ResponseBody
//    public String toUpdateCar(@RequestBody Integer id,Model model) {
//        Car car = carMapper.toUpdateCar(id);
//        model.addAttribute("car", car);
//        return "updateCar";
//    }

    @RequestMapping("/updateCar")
    public void updateCar(@RequestBody Car car){
        carMapper.updateCar(car);

    }

    @RequestMapping("toAdd")
    public String toAdd(){
        return "addCar";
    }

    @RequestMapping("addCar")
    @ResponseBody
    public void addCar(@RequestBody Car car){
        System.out.println(1);
        carMapper.addCar( car);
    }
  
}
