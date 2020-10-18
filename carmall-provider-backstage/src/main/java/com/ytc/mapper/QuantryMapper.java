package com.ytc.mapper;

import com.ytc.model.Quantry;
import org.springframework.stereotype.Component;

@Component
public interface QuantryMapper {
    int deleteByPrimaryKey(Integer quid);

    int insert(Quantry record);

    int insertSelective(Quantry record);

    Quantry selectByPrimaryKey(Integer quid);

    int updateByPrimaryKeySelective(Quantry record);

    int updateByPrimaryKey(Quantry record);
}