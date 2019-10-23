package com.lzc.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Copyright (c) 2019, Lzc,LTD All Rights Reserved.
 *
 * @author Lvzc
 * @ClassName: ConfigBean
 * @Description: TODO RestTemplate用于模拟发送REST的客户端请求
 * @Function List:TODO 主要函数及其功能
 * @Date 2019年10月21日   10:33
 * @History: // 历史修改记录 
 * <author>     // 修改人
 * <time>      // 修改时间
 * <version>     // 版本
 * <description> // 描述修改内容
 */
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    /**
     * 通过Ribbon的核心组件IRule定义查找消费端调用提供端微服务的策略
     * 如没有指定轮询策略，默认是消费端随机调用提供端微服的策略，下面指定轮询调用策略。
     * @return
     */
    @Bean
    public IRule myRule(){
        return new RoundRobinRule(); 	//轮询策略
    }
}
