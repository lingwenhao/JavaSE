package create.abstractfactory.abstractfactory_b.factory;

import create.abstractfactory.abstractfactory_b.service.CustomerServiceOracle;
import create.abstractfactory.abstractfactory_b.service.ICustomerService;
import create.abstractfactory.abstractfactory_b.service.IUserService;
import create.abstractfactory.abstractfactory_b.service.UserServiceOracle;

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
