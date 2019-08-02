package create.abstractfactory.abstractfactory_d;

/**
 * @author ronin
 * @version V1.0
 * @desc
 * @since 2019/8/2 10:32
 */
public class Client {
    public static void main(String[] args) {
        //操作文本文件的类的工厂
        TxtFileOperatorFactory txtFileOperatorFactory = new TxtFileOperatorFactory();
        //操作文本文件的类
        FileOperator txtFileOperator = txtFileOperatorFactory.createFileOperator();
        txtFileOperator.exportFile("20190802数据");
        txtFileOperator.importFile("20190802数据");

        //操作数据库文件的类的工厂
        DBOperatorFacorty dbOperatorFacorty = new DBOperatorFacorty();
        //操作数据库文件的类
        FileOperator dbFileOperator = dbOperatorFacorty.createFileOperator();
        dbFileOperator.exportFile("20190802数据");
        dbFileOperator.importFile("20190802数据");
    }
}
