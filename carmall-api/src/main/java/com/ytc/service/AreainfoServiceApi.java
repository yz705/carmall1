package com.ytc.service;

import com.ytc.model.Areainfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface AreainfoServiceApi {
    @RequestMapping("/selectprovince")
    List<Areainfo> selectAreainfo();
    @RequestMapping("/selectCity")
    List<Areainfo> selectCity(@RequestParam("sheng")Integer sheng);
    @RequestMapping("/selectdistrict")
    List<Areainfo> selectdistrict(@RequestParam("city")Integer city);
}
