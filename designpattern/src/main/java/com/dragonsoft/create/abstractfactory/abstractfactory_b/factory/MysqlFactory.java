package com.dragonsoft.create.abstractfactory.abstractfactory_b.factory;

import com.dragonsoft.create.abstractfactory.abstractfactory_b.service.CustomerServiceMysql;
import com.dragonsoft.create.abstractfactory.abstractfactory_b.service.ICustomerService;
import com.dragonsoft.create.abstractfactory.abstractfactory_b.service.IUserService;
import com.dragonsoft.create.abstractfactory.abstractfactory_b.service.UserServiceMysql;

public class MysqlFactory implements PersistencecFactory {
    @Override
    public IUserService getUserOperator() {
        return new UserServiceMysql();
    }

    @Override
    public ICustomerService getCustomerOperator() {
        return new CustomerServiceMysql();
    }
}
