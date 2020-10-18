package com.ytc.mapper;

import com.ytc.model.Areainfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface AreainfoMapper {

    List<Areainfo> selectAreainfo();

    List<Areainfo> selectCity(@Param("sheng") Integer sheng);

    List<Areainfo> selectdistrict(@Param("city")Integer city);

    int selectpid(@Param("pid") String pid);
    int selectcid(@Param("cid") String cid);
    int selectdid(@Param("did") String did);
}