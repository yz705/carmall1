package com.ytc.mapper;

import com.ytc.model.Province;

public interface ProvinceMapper {
    int deleteByPrimaryKey(Integer provinceid);

    int insert(Province record);

    int insertSelective(Province record);

    Province selectByPrimaryKey(Integer provinceid);

    int updateByPrimaryKeySelective(Province record);

    int updateByPrimaryKey(Province record);
}