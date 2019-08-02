package create.abstractfactory.abstractfactory_e;


/**
 * @author ronin
 * @version V1.0
 * @desc 操作数据库脚本的工厂
 * @since 2019/8/2 10:29
 */
public class DBOperatorFacorty extends AbstractFileOperatorFactory {

    @Override
    public FileOperator createFileOperator() {
        return new DbFileOperator();
    }
}
