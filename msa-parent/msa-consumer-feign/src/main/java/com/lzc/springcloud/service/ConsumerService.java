package com.lzc.springcloud.service;

import com.lzc.springcloud.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Copyright (c) 2019, Lzc,LTD All Rights Reserved.
 *
 * @author Lvzc
 * @ClassName: ConsumerService
 * @Description: TODO 一句话功能简述
 * @Function List:TODO 主要函数及其功能
 * @Date 2019年10月23日   15:21
 * @History: // 历史修改记录 
 * <author>     // 修改人
 * <time>      // 修改时间
 * <version>     // 版本
 * <description> // 描述修改内容
 */
/*以后调用microservicecloud-provider微服务中的方法，只需要调用下面对应的接口既可以了*/
@FeignClient(value="msa-provider")
public interface ConsumerService {

    /*调用接口中的get方法，即可以向msa-provider微服务发送/get/{id}请求*/
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public User get(@PathVariable("id") Integer id);

    @RequestMapping(value="/add", method=RequestMethod.POST)
    public boolean add(User user);

    @RequestMapping(value="/getUser/list", method=RequestMethod.GET)
    public List<User> getAll();
}
