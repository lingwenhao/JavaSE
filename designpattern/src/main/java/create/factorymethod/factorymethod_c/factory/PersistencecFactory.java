package create.factorymethod.factorymethod_c.factory;

import create.factorymethod.factorymethod_c.service.IUserService;

public interface PersistencecFactory {
    IUserService getOperator();
}
