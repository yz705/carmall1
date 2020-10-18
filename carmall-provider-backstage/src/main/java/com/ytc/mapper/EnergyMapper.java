package com.ytc.mapper;

import com.ytc.model.Energy;
import org.springframework.stereotype.Component;


@Component
public interface EnergyMapper {
    int deleteByPrimaryKey(Integer enid);

    int insert(Energy record);

    int insertSelective(Energy record);

    Energy selectByPrimaryKey(Integer enid);

    int updateByPrimaryKeySelective(Energy record);

    int updateByPrimaryKey(Energy record);
}