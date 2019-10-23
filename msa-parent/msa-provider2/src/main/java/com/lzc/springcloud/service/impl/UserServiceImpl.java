package com.lzc.springcloud.service.impl;

import com.lzc.springcloud.dao.UserDao;
import com.lzc.springcloud.entity.User;
import com.lzc.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Copyright (c) 2019, Lzc,LTD All Rights Reserved.
 *
 * @author Lvzc
 * @ClassName: UserServiceImpl
 * @Description: TODO 一句话功能简述
 * @Function List:TODO 主要函数及其功能
 * @Date 2019年10月18日   15:33
 * @History: // 历史修改记录 
 * <author>     // 修改人
 * <time>      // 修改时间
 * <version>     // 版本
 * <description> // 描述修改内容
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public boolean addUser(User user) {
        boolean flag;
        flag = userDao.addUser(user);
        return flag;
    }

    @Override
    public User getUser(int id) {
        User user = userDao.getUser(id);
        return user;
    }

    @Override
    public List<User> getUsers() {
        List<User> users = userDao.getUsers();
        return users;
    }

}
