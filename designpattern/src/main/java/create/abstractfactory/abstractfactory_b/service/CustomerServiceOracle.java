package create.abstractfactory.abstractfactory_b.service;

import create.abstractfactory.abstractfactory_b.domain.Cusomer;

public class CustomerServiceOracle implements ICustomerService {

    @Override
    public Cusomer get(Integer uid) {
        System.out.println("Oracle操作数据库......Customer");
        return new Cusomer();
    }
}
