package com.ytc.mapper;

import com.ytc.model.Order;
import com.ytc.model.Province;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface OrderMapper {
    List<Order> queryOrder();
}