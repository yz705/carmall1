package com.ytc.controller;

import com.ytc.model.Car;
import com.ytc.service.*;
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
 * DATE: 2020/10/14
 * TIME: 15:36
 * JDK 1.8
 */
@Controller
public class CarController {
    @Autowired
    private CarService carService;

    @Autowired
    private CountryService countryService;

    @Autowired
    private DiveService diveService;

    @Autowired
    private EnergyService energyService;

    @Autowired
    private GearboxService gearboxService;

    @Autowired
    private PinpaiService pinpaiService;

    @Autowired
    private QuantryService quantryService;

    @RequestMapping("/queryCarList")
    public String queryCarList(Model model){
        List<Car> list =carService.queryCarList();
        model.addAttribute("list",list);
        return "list";
    }


    @RequestMapping("delCar")
    public String delCar(Integer id) {
        carService.delCar(id);
        return "redirect:queryCarList";
    }

    @RequestMapping("toUpdateCar")
    public String toUpdateCar(Integer id, Model model) {
        Car car = carService.toUpdateCar(id);
        model.addAttribute("car", car);
        return "updateCar";
    }

    @RequestMapping("updateCar")
    public String updateCar(Car car){
        carService.updateCar(car);
        return "redirect:queryCarList";
    }

    @RequestMapping("toAdd")
    public String toAdd(){
        return "addCar";
    }

    @RequestMapping("addCar")
    @ResponseBody
    public void addCar(Car car){
        System.out.println(car);
        carService.addCar(car);
    }

}
