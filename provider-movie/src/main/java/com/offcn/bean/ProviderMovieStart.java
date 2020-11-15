package com.offcn.bean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/*
 *ProviderMovieStart
 *@author peizhu
 *@date 2020/10/7 21:17
 *@Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderMovieStart {
    public static void main(String[] args) {
        SpringApplication.run(ProviderMovieStart.class);
    }
}
