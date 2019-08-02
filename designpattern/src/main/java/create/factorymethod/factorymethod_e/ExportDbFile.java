package create.factorymethod.factorymethod_e;

/**
 * @author ronin
 * @version V1.0
 * @desc    提供导出文件到数据库脚本API 的对象,本质上是一个API的提供者
 * @since 2019/8/2 10:20
 */
public class ExportDbFile implements ExportFileApi{

    /**
     * 导出文件到数据库文件
     * @param data 具体要导出的数据
     * @return
     */
    @Override
    public boolean export(String data) {
        System.out.println("导出"+data+"到sql脚本......");
        return false;
    }
}
