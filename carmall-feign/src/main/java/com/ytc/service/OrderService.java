package com.ytc.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value="service-provider-order")
public interface OrderService extends OrderServiceApi{
}
