package create.factorymethod.factorymethod_e;

/**
 * @author ronin
 * @version V1.0
 * @desc    提供导出文件到文本文档API 的对象,本质上是一个API的提供者
 * @since 2019/8/2 9:30
 */
public class ExportTxtFile implements ExportFileApi{

    /**
     * 导出文件到文本文件
     * @param data 具体要导出的数据
     * @return
     */
    @Override
    public boolean export(String data) {
        System.out.println("导出"+data+"文本文件......");
        return false;
    }
}
