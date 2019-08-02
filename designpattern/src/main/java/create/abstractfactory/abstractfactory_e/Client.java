package create.abstractfactory.abstractfactory_e;

/**
 * @author ronin
 * @version V1.0
 * @desc
 * @since 2019/8/2 10:32
 */
public class Client {
    public static void main(String[] args) {
        //操作文本文件的类的工厂
        FileOperatorManageFactory instance = FileOperatorManageFactory.getInstance();
        //AbstractFileOperatorFactory干了两件事:1.创建了对象 2.执行了方法
        AbstractFileOperatorFactory concreteFileOperatorFactory = instance.getConcreteFileOperatorFactory();

        concreteFileOperatorFactory.exportFile("xxxx");
        concreteFileOperatorFactory.importFile("xxxx");
    }
}
