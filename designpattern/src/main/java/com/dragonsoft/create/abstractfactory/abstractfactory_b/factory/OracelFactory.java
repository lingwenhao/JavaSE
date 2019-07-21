package com.dragonsoft.create.abstractfactory.abstractfactory_b.factory;

import com.dragonsoft.create.abstractfactory.abstractfactory_b.service.CustomerServiceOracle;
import com.dragonsoft.create.abstractfactory.abstractfactory_b.service.ICustomerService;
import com.dragonsoft.create.abstractfactory.abstractfactory_b.service.IUserService;
import com.dragonsoft.create.abstractfactory.abstractfactory_b.service.UserServiceOracle;

public class OracelFactory implements PersistencecFactory {
    @Override
    public IUserService getUserOperator() {
        return new UserServiceOracle();
    }

    @Override
    public ICustomerService getCustomerOperator() {
        return new CustomerServiceOracle();
    }
}
