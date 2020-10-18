package com.ytc.service;

import com.ytc.model.Adress;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface AdressServiceApi {
    @RequestMapping("selectadress")
    List<Adress> selectadress(@RequestParam("userid") Integer userid);
    @RequestMapping("/adressadd")
    void adressadd(@RequestBody Adress adress);
}
