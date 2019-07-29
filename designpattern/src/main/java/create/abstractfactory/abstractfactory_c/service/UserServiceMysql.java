package create.abstractfactory.abstractfactory_c.service;

import create.abstractfactory.abstractfactory_c.domain.User;

public class UserServiceMysql implements IUserService {

    @Override
    public User get(Integer uid) {
        System.out.println("Mysql操作数据库......User");
        return new User();
    }
}
