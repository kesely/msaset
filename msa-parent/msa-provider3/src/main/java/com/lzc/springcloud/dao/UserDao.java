package com.lzc.springcloud.dao;
import java.util.List;

import com.lzc.springcloud.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Copyright (c) 2019, Lzc,LTD All Rights Reserved.
 *
 * @author Lvzc
 * @ClassName: UserDao
 * @Description: TODO 一句话功能简述
 * @Function List:TODO 主要函数及其功能
 * @Date 2019年10月18日   15:28
 * @History: // 历史修改记录 
 * <author>     // 修改人
 * <time>      // 修改时间
 * <version>     // 版本
 * <description> // 描述修改内容
 */

@Mapper
public interface UserDao {

    public boolean addUser(User user);

    public User getUser(int id);

    public List<User> getUsers();
}
