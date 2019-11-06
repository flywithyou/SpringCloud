package com.tedu.sp09;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

//@EnableCircuitBreaker
//@EnableDiscoveryClient
//@SpringBootApplication
@EnableFeignClients
@SpringCloudApplication
public class FeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class,args);
    }
}
