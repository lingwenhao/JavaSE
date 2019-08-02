package create.abstractfactory.abstractfactory_e;

/**
 * @author ronin
 * @version V1.0
 * @desc    1.生产操作操作文件API的的类工厂
 *          2.同时执行了具体的操作
 * @since 2019/8/2 11:34
 */
public abstract class AbstractFileOperatorFactory {

    /**
     * 导出文件
     * @param data
     * @return
     */
    public boolean exportFile(String data){
        FileOperator txtFileOperator = this.createFileOperator();
        return txtFileOperator.exportFile(data);
    }

    /**
     * 导入文件
     * @param data
     * @return
     */
    public boolean importFile(String data){
        FileOperator txtFileOperator = this.createFileOperator();
        return txtFileOperator.importFile(data);
    }

    /**
     * 创建具体的文件操作者
     * @return
     */
    public abstract FileOperator createFileOperator();
}
