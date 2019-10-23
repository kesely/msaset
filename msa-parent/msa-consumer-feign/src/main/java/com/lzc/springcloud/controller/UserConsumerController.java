package com.lzc.springcloud.controller;

import com.lzc.springcloud.entity.User;
import com.lzc.springcloud.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Copyright (c) 2019, Lzc,LTD All Rights Reserved.
 *
 * @author Lvzc
 * @ClassName: UserConsumerController
 * @Description: TODO 一句话功能简述
 * @Function List:TODO 主要函数及其功能
 * @Date 2019年10月21日   10:36
 * @History: // 历史修改记录 
 * <author>     // 修改人
 * <time>      // 修改时间
 * <version>     // 版本
 * <description> // 描述修改内容
 */
@RestController
public class UserConsumerController {
    //private static String REST_URL_PREFIX = "http://localhost:8002";
    /*直接根据微服务名调用，而不再是根据地址和端口了，运用了eureka的发现功能*/
//    private static String REST_URL_PREFIX = "http://msa-provider";
//    @Autowired
//    private RestTemplate restTemplate;

    @Autowired
    private ConsumerService consumerService;

    @RequestMapping(value="/consumer/add")
    public boolean addUser(User user){
//        Boolean flag = restTemplate.postForObject(REST_URL_PREFIX + "/add", user, Boolean.class);
//        return flag;
        Boolean flag = consumerService.add(user);
        return flag;
    }

    @RequestMapping(value="/consumer/get/{id}")
    public User get(@PathVariable("id") int id){
//        User user = restTemplate.getForObject(REST_URL_PREFIX + "/get/" + id, User.class);
//        return user;
        User user = consumerService.get(id);
        return user;
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @RequestMapping(value="/consumer/list")
    public List<User> getList(){
//        List list = restTemplate.getForObject(REST_URL_PREFIX + "/getUser/list", List.class);
//        return list;
        List list = consumerService.getAll();
        return list;
    }
}
