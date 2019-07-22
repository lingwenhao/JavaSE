package com.dragonsoft.create.abstractfactory.abstractfactory_c.service;

import com.dragonsoft.create.abstractfactory.abstractfactory_c.domain.User;

public class UserServiceOracle implements IUserService {
    @Override
    public User get(Integer uid) {
        System.out.println("Oracel操作数据库......User");
        return new User();
    }
}
