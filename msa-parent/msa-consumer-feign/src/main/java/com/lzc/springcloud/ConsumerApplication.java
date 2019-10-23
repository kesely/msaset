package com.lzc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages="com.lzc.springcloud.service")
public class ConsumerApplication
{
    public static void main( String[] args ) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
