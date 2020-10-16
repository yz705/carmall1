package com.ytc;

import com.ytc.util.RandomIDUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
@EnableFeignClients
public class CarmallFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarmallFeignApplication.class, args);
/*        for (int i=0;i<=100;i++){
            test();
        }

    }

    public static void test(){
        RandomIDUtil ra=new RandomIDUtil();
        long l = ra.nextId();
        System.out.println(l);*/
    }

}
