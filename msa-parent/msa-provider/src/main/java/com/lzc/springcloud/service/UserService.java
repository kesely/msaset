package com.lzc.springcloud.service;

import com.lzc.springcloud.entity.User;

import java.util.List;

/**
 * Copyright (c) 2019, Lzc,LTD All Rights Reserved.
 *
 * @author Lvzc
 * @ClassName: UserService
 * @Description: TODO 一句话功能简述
 * @Function List:TODO 主要函数及其功能
 * @Date 2019年10月18日   15:32
 * @History: // 历史修改记录 
 * <author>     // 修改人
 * <time>      // 修改时间
 * <version>     // 版本
 * <description> // 描述修改内容
 */
public interface UserService {
    public boolean addUser(User user);

    public User getUser(int id);

    public List<User> getUsers();
}
