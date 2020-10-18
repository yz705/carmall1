package com.ytc.controller;

import com.ytc.mapper.AdressMapper;
import com.ytc.mapper.AreainfoMapper;
import com.ytc.model.Adress;
import com.ytc.service.AdressServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AdressController implements AdressServiceApi {
    @Autowired
  private   AdressMapper adressMapper;
    @Autowired
    private  AreainfoMapper areainfoMapper;
    @RequestMapping("selectadress")
    @ResponseBody
    public List<Adress> selectadress(@RequestParam("userid")Integer userid) {
        List<Adress>  list   =adressMapper.selectadress(userid);
        return list;
    }

    @RequestMapping("adressadd")
    @ResponseBody
    public void adressadd(@RequestBody Adress adress) {
        System.out.println(adress);
       String pid= adress.getProvince().getAreaId();
        String cid = adress.getCity().getAreaId();
        String did = adress.getDistrict().getAreaId();
       int id1= areainfoMapper.selectpid(pid);
       adress.getProvince().setId(id1);
        int id2= areainfoMapper.selectcid(cid);
        adress.getCity().setId(id2);
        int id3= areainfoMapper.selectdid(did);
        adress.getDistrict().setId(id3);
        System.out.println(adress);
        adressMapper.adressadd(adress);


    }


}
