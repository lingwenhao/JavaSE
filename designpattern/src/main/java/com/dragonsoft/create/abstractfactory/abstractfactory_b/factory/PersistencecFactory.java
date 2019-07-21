package com.dragonsoft.create.abstractfactory.abstractfactory_b.factory;

import com.dragonsoft.create.abstractfactory.abstractfactory_b.service.ICustomerService;
import com.dragonsoft.create.abstractfactory.abstractfactory_b.service.IUserService;

public interface PersistencecFactory {
    IUserService getUserOperator();
    ICustomerService getCustomerOperator();
}
