package com.offcn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/*
 *ConsumerUserStart
 *@author peizhu
 *@date 2020/10/7 21:29
 *@Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker   //开启断路保护功能
public class ConsumerUserStart {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerUserStart.class);
    }

    @LoadBalanced
    @Bean
    public RestTemplate getTemplate(){
        return new RestTemplate();
    }
}
