package com.ytc.mapper;

import com.ytc.model.Gearbox;
import org.springframework.stereotype.Component;


@Component
public interface GearboxMapper {
    int deleteByPrimaryKey(Integer geid);

    int insert(Gearbox record);

    int insertSelective(Gearbox record);

    Gearbox selectByPrimaryKey(Integer geid);

    int updateByPrimaryKeySelective(Gearbox record);

    int updateByPrimaryKey(Gearbox record);
}