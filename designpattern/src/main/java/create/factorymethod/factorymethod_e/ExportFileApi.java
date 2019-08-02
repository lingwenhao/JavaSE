package create.factorymethod.factorymethod_e;

/**
 * @author ronin
 * @version V1.0
 * @desc 导出文件接口，本质上是一个,本质上是一个API的提供者的规范接口
 * @since 2019/8/2 9:29
 */
public interface ExportFileApi {

    /**
     * 导出方法
     * @param data 具体要导出的数据
     * @return
     */
    boolean export(String data);

}
