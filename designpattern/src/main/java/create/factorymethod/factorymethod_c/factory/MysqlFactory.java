package create.factorymethod.factorymethod_c.factory;

import create.factorymethod.factorymethod_c.service.IUserService;
import create.factorymethod.factorymethod_c.service.UserServiceMysql;

public class MysqlFactory implements PersistencecFactory{
    @Override
    public IUserService getOperator() {
        return new UserServiceMysql();
    }
}
