package com.ytc.mapper;

import com.ytc.model.Pinpai;
import org.springframework.stereotype.Component;


@Component
public interface PinpaiMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(Pinpai record);

    int insertSelective(Pinpai record);

    Pinpai selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Pinpai record);

    int updateByPrimaryKey(Pinpai record);
}