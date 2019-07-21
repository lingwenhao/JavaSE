package com.dragonsoft.create.factorymethod.factorymethod_c.factory;

import com.dragonsoft.create.factorymethod.factorymethod_c.service.IUserService;

public interface PersistencecFactory {
    IUserService getOperator();
}
