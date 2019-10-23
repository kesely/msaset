package com.lzc.springcloud.controller;

import com.lzc.springcloud.entity.User;
import com.lzc.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Copyright (c) 2019, Lzc,LTD All Rights Reserved.
 *
 * @author Lvzc
 * @ClassName: UserController
 * @Description: TODO 一句话功能简述
 * @Function List:TODO 主要函数及其功能
 * @Date 2019年10月18日   15:34
 * @History: // 历史修改记录 
 * <author>     // 修改人
 * <time>      // 修改时间
 * <version>     // 版本
 * <description> // 描述修改内容
 */
@RestController
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping(value="/add", method=RequestMethod.POST)
    public boolean addUser(@RequestBody User user){
        System.out.println("调用provider1:8002");
        boolean flag = service.addUser(user);
        return flag;
    }

    @RequestMapping(value="/get/{id}", method=RequestMethod.GET)
    public User getUser(@PathVariable("id") int id){
        User user = service.getUser(id);
        System.out.println("调用provider1:8002");
        System.out.println("msa-provider微服务在响应客户端请求……");
        System.out.println("user : " + user);
        return user;
    }

    @RequestMapping(value="/getUser/list", method= RequestMethod.GET)
    public List<User> getUsers(){
        System.out.println("调用provider1:8002");
        List<User> users = service.getUsers();
        return users;
    }
}