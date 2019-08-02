package create.factorymethod.factorymethod_e;

/**
 * @author ronin
 * @version V1.0
 * @desc
 * @since 2019/8/2 10:28
 */
public class ExportTxtFileOperatorFactory  extends AbstractExportOperatorFactory {

    /**
     * 工厂方法，创建导出的文件对象的接口对象
     * @return 导出的文件对象的接口对象
     */
    @Override
    protected ExportFileApi factoryMethod() {
        //创建导出成文本文件格式的对象
        return new ExportTxtFile();
    }
}
