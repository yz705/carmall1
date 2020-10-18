package com.ytc.controller;

import com.ytc.mapper.AreainfoMapper;
import com.ytc.model.Areainfo;
import com.ytc.service.AreainfoServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
public class AreainfoController implements AreainfoServiceApi {
    @Autowired
    private  AreainfoMapper areainfoMapper;
    @RequestMapping("/selectprovince")
    @ResponseBody
    public List<Areainfo> selectAreainfo() {
        List<Areainfo> list=areainfoMapper.selectAreainfo();
        return list;
    }

    @RequestMapping("/selectCity")
    @ResponseBody
    public List<Areainfo> selectCity(@RequestParam("sheng")Integer sheng) {
        return areainfoMapper.selectCity(sheng);
    }

    @RequestMapping("/selectdistrict")
    @ResponseBody
    public List<Areainfo> selectdistrict(@RequestParam("city")Integer city) {
        return areainfoMapper.selectdistrict(city);
    }
}
