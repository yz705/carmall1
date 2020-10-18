package com.ytc.mapper;

import com.ytc.model.Car;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;



@Component
public interface CarMapper {

    List<Car> queryCarList();

    void delCar(Integer id);

    Car toUpdateCar(Integer id);

    void updateCar(@Param("c") Car car);

    void addCar(@Param("c") Car car);

}