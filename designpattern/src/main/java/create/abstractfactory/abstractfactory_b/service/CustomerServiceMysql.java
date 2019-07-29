package create.abstractfactory.abstractfactory_b.service;

import create.abstractfactory.abstractfactory_b.domain.Cusomer;

public class CustomerServiceMysql implements ICustomerService {

    @Override
    public Cusomer get(Integer uid) {
        System.out.println("Mysql操作数据库......Customer");
        return new Cusomer();
    }
}
