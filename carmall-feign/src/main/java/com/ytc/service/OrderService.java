package com.ytc.service;


import com.ytc.model.Order;
import org.springframework.cloud.openfeign.FeignClient;

import java.util.List;

@FeignClient(value="service-provider-order")
public interface OrderService extends OrderServiceApi{


}
