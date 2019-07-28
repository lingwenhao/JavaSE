package create.factorymethod.factorymethod_c.service;

import create.factorymethod.factorymethod_c.domain.User;

public class UserServiceMysql implements IUserService{

    @Override
    public User get(Integer uid) {
        System.out.println("Mysql操作数据库......");
        return new User();
    }
}
