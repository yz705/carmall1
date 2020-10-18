package com.ytc.service;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * Created with IntelliJ IDEA
 * USER:gso
 * CLASSNAME: carmall
 * DATE: 2020/10/13
 * TIME: 16:50
 * JDK 1.8
 */
@FeignClient(value = "service-provider-backstage")
public interface GearboxService extends GearboxServiceApi{
}
