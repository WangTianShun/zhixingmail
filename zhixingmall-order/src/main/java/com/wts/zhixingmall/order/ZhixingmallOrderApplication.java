package com.wts.zhixingmall.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ZhixingmallOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhixingmallOrderApplication.class, args);
    }

}
