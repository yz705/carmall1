package com.ytc.mapper;

import com.ytc.model.Order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface OrderMapper {
    List<Order> select();
}