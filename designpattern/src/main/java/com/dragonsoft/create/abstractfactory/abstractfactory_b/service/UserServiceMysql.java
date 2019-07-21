package com.dragonsoft.create.abstractfactory.abstractfactory_b.service;

import com.dragonsoft.create.abstractfactory.abstractfactory_b.domain.User;

public class UserServiceMysql implements IUserService {

    @Override
    public User get(Integer uid) {
        System.out.println("Mysql操作数据库......User");
        return new User();
    }
}
