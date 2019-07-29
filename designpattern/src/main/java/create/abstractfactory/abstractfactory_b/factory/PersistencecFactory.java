package create.abstractfactory.abstractfactory_b.factory;

import create.abstractfactory.abstractfactory_b.service.ICustomerService;
import create.abstractfactory.abstractfactory_b.service.IUserService;

public interface PersistencecFactory {
    IUserService getUserOperator();
    ICustomerService getCustomerOperator();
}
