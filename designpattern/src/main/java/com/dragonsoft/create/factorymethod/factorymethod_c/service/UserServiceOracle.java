package com.dragonsoft.create.factorymethod.factorymethod_c.service;

import com.dragonsoft.create.factorymethod.factorymethod_c.domain.User;

public class UserServiceOracle implements IUserService{
    @Override
    public User get(Integer uid) {
        System.out.println("Oracel操作数据库......");
        return new User();
    }
}
