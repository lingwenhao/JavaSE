package create.abstractfactory.abstractfactory_b.client;

import create.abstractfactory.abstractfactory_b.factory.EasyPersistenceFactory;
import create.abstractfactory.abstractfactory_b.factory.MysqlFactory;
import create.abstractfactory.abstractfactory_b.factory.PersistencecFactory;
import create.abstractfactory.abstractfactory_b.service.ICustomerService;
import create.abstractfactory.abstractfactory_b.service.IUserService;

/**
 * 测试抽象工厂+简单工厂(保留该产品的抽象工厂和具体抽象工厂的实现类)
 */
public class EasyPersistenceFactoryClient {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        //从简单工厂中创建具体的工厂类
            //Mysql工厂
        PersistencecFactory operatorFactory = EasyPersistenceFactory.getOperator(MysqlFactory.class);
            //Oracle工厂
        //PersistencecFactory operatorFactory = EasyPersistenceFactory.getOperator(OracelFactory.class);
        //从具体的工厂中创建操作者
        IUserService userOperator= operatorFactory.getUserOperator();
        ICustomerService customerOperator = operatorFactory.getCustomerOperator();
        //执行具体的操做
        userOperator.get(1);
        customerOperator.get(1);
    }
}
