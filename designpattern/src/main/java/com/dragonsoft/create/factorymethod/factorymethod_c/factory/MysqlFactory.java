package com.dragonsoft.create.factorymethod.factorymethod_c.factory;

import com.dragonsoft.create.factorymethod.factorymethod_c.service.IUserService;
import com.dragonsoft.create.factorymethod.factorymethod_c.service.UserServiceMysql;

public class MysqlFactory implements PersistencecFactory{
    @Override
    public IUserService getOperator() {
        return new UserServiceMysql();
    }
}
