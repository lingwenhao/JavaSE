package create.abstractfactory.abstractfactory_e;

/**
 * @author ronin
 * @version V1.0
 * @desc 操作文件的接口，本质上是一个,本质上是一个API的提供者的规范接口
 * @since 2019/8/2 9:29
 */
public interface FileOperator {

    /**
     * 导出方法
     * @param data 具体要导出的数据
     * @return
     */
    boolean exportFile(String data);

    /**
     * 导入方法
     * @param data
     * @return
     */
    boolean importFile(String data);
}
