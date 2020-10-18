package com.ytc.mapper;

import com.ytc.model.Country;

import org.springframework.stereotype.Component;


@Component
public interface CountryMapper {
    int deleteByPrimaryKey(Integer coid);

    int insert(Country record);

    int insertSelective(Country record);

    Country selectByPrimaryKey(Integer coid);

    int updateByPrimaryKeySelective(Country record);

    int updateByPrimaryKey(Country record);
}