package create.abstractfactory.abstractfactory_e;


/**
 * @author ronin
 * @version V1.0
 * @desc 使用工厂模式+抽象工厂模式+单例模式 实现操作文件
 * @since 2019/8/2 13:32
 */
public class FileOperatorManageFactory {
    private static final FileOperatorManageFactory fileOperatorManageFactory = new FileOperatorManageFactory();
    private FileOperatorManageFactory(){

    }
    public static FileOperatorManageFactory getInstance(){
        return fileOperatorManageFactory;
    }

    private static final String DEAULT_OPERATE_TYPE = "txt";

    /**
     * 创建 创建具体的操作类的工厂
     * @return
     */
    public AbstractFileOperatorFactory getConcreteFileOperatorFactory(){
        AbstractFileOperatorFactory abstractFileOperatorFactory = null;
        switch (DEAULT_OPERATE_TYPE){
            case "txt":
                abstractFileOperatorFactory = new TxtFileOperatorFactory();
                break;
            case "db":
                abstractFileOperatorFactory = new DBOperatorFacorty();
                break;
            default:
                break;
        }
        return abstractFileOperatorFactory;
    }

//    public FileOperator getConcreteOperator(){
//        return getConcreteFileOperatorFactory().
//    }
}
