package com.ytc.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value="service-provider-trolley")
public interface AreainfoService extends AreainfoServiceApi{
}
