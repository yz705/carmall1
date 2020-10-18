package com.ytc.mapper;

import com.ytc.model.Adress;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface AdressMapper {

    List<Adress> selectadress(@Param("userid") Integer userid);

    void adressadd(@Param("adress")Adress adress);
}