package com.dragonsoft.create.abstractfactory.abstractfactory_c.service;

import com.dragonsoft.create.abstractfactory.abstractfactory_c.domain.Cusomer;

public class CustomerServiceOracle implements ICustomerService {

    @Override
    public Cusomer get(Integer uid) {
        System.out.println("Oracle操作数据库......Customer");
        return new Cusomer();
    }
}
