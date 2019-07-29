package create.abstractfactory.abstractfactory_b.factory;

import create.abstractfactory.abstractfactory_b.service.CustomerServiceMysql;
import create.abstractfactory.abstractfactory_b.service.ICustomerService;
import create.abstractfactory.abstractfactory_b.service.IUserService;
import create.abstractfactory.abstractfactory_b.service.UserServiceMysql;

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
