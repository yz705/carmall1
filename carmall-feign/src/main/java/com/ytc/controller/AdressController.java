package com.ytc.controller;

import com.ytc.model.Adress;
import com.ytc.model.Areainfo;
import com.ytc.service.AdressService;
import com.ytc.service.AreainfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/adress")
public class AdressController {
    @Autowired
    private AreainfoService areainfoService;
    @Autowired
    private AdressService adressService;

    @RequestMapping("selectadress" )
    @ResponseBody
    public List<Adress> selectadress(){
        Integer   userid =1;
        List<Adress> list= adressService.selectadress(userid);
        return list;
    }
    @RequestMapping("/addAdress")
    public String addAdress(){

        return "addAdress";
    }
    @RequestMapping("/selectprovince")
    @ResponseBody
    public List<Areainfo> selectprovince(){
       return areainfoService.selectAreainfo();
    }
    @RequestMapping("/selectCity")
    @ResponseBody
    public List<Areainfo> selectCity(Integer sheng){
        return areainfoService.selectCity(sheng);
    }

    @RequestMapping("/selectdistrict")
    @ResponseBody
    public List<Areainfo> selectdistrict(Integer city){
        return areainfoService.selectdistrict(city);
    }
    @RequestMapping("/adressadd")
    @ResponseBody
    public void adressadd(Adress adress){
        Integer userid=1;
        adress.setUserId(userid);
        adressService.adressadd(adress);
    }
}
