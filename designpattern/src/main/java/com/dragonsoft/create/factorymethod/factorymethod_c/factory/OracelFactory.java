package com.dragonsoft.create.factorymethod.factorymethod_c.factory;

import com.dragonsoft.create.factorymethod.factorymethod_c.service.IUserService;
import com.dragonsoft.create.factorymethod.factorymethod_c.service.UserServiceOracle;

public class OracelFactory implements PersistencecFactory{
    @Override
    public IUserService getOperator() {
        return new UserServiceOracle();
    }
}
