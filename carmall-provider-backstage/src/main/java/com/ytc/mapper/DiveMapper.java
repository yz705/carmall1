package com.ytc.mapper;

import com.ytc.model.Dive;
import org.springframework.stereotype.Component;

@Component
public interface DiveMapper {
    int deleteByPrimaryKey(Integer did);

    int insert(Dive record);

    int insertSelective(Dive record);

    Dive selectByPrimaryKey(Integer did);

    int updateByPrimaryKeySelective(Dive record);

    int updateByPrimaryKey(Dive record);
}