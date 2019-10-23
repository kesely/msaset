package com.lzc.springcloud.entity;

/**
 * Copyright (c) 2019, Lzc,LTD All Rights Reserved.
 *
 * @author Lvzc
 * @ClassName: User
 * @Description: TODO 用户类
 * @Function List:TODO 主要函数及其功能
 * @Date 2019年10月15日   21:09
 * @History: // 历史修改记录 
 * <author>     // 修改人
 * <time>      // 修改时间
 * <version>     // 版本
 * <description> // 描述修改内容
 */
public class User {
    private int id;
    private String name;
    private int age;

    public User() {
        super();
    }

    public User(int id, String name, int age) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
}