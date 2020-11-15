package com.offcn.bean.bean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/*
 *EurekaServerStart
 *@author peizhu
 *@date 2020/10/7 20:33
 *@Version 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerStart {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerStart.class);
    }
}
