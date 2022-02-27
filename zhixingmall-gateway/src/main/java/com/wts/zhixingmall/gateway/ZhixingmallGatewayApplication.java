package com.wts.zhixingmall.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 1、开启服务的注册与发现
 *    (配置Nacos的中心地址)
 */
@EnableDiscoveryClient
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ZhixingmallGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhixingmallGatewayApplication.class, args);
    }

}
