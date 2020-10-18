package com.ytc.mapper;

import com.ytc.model.User;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}