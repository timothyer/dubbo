package com.dubbo.service.impl;

import com.dubbo.service.UserService;

/**
 * @author timothyer
 * @date 2018-5-7
 */
public class UserServiceImpl implements UserService {

    @Override
    public String sayHello() {
        return "hello";
    }
}
