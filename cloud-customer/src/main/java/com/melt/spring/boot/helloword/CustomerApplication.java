package com.melt.spring.boot.helloword;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients //用于启动Fegin功能
public class CustomerApplication {

//    @Bean
//    @LoadBalanced //客户端负载均衡，轮询
//    public RestTemplate restTemplate () {
//        return new RestTemplate();
//    }

    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
    }
}