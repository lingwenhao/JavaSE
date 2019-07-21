package com.dragonsoft.create.abstractfactory.abstractfactory_b.factory;

import com.dragonsoft.create.abstractfactory.abstractfactory_b.service.ICustomerService;
import com.dragonsoft.create.abstractfactory.abstractfactory_b.service.IUserService;

public class Client {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        //从简单工厂中创建具体的工厂类
        PersistencecFactory mysqlOperator = EasyPersistenceFactory.getOperator(MysqlFactory.class);
        PersistencecFactory oracleOperator = EasyPersistenceFactory.getOperator(OracelFactory.class);
        //从具体的工厂中创建操作者
        IUserService userOperatorMysql = mysqlOperator.getUserOperator();
        IUserService userOperatorOracle = oracleOperator.getUserOperator();
        //执行具体的操做
        userOperatorMysql.get(1);
        userOperatorOracle.get(1);

        ICustomerService customerOperatorMysql = mysqlOperator.getCustomerOperator();
        ICustomerService customerOperatorOracle = oracleOperator.getCustomerOperator();
        customerOperatorMysql.get(1);
        customerOperatorOracle.get(1);
    }
}
