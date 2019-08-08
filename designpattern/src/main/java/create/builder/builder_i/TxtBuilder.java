package create.builder.builder_i;

import java.util.Collection;
import java.util.Map;

/**
 * @author ronin
 * @version V1.0
 * @since 2019/8/8 14:21
 */
public class TxtBuilder implements Builder{

    /**用来记录构建的文件的内容，相当于产品*/
    private StringBuffer buffer = new StringBuffer();

    @Override
    public void buildHeader(ExportHeaderModel ehm) {
        buffer.append(ehm.getDepId()+","+ehm.getExportDate()+"\n");
    }

    @Override
    public void buildBody(Map<String, Collection<ExportDataModel>> mapData) {
        for(String tblName : mapData.keySet()){
            //先拼接表名称
            buffer.append(tblName+"\n");
            //然后循环拼接具体数据
            for(ExportDataModel edm : mapData.get(tblName)){
                buffer.append(edm.getProductId()+","+edm.getPrice()+","+edm.getAmount()+"\n");
            }
        }
    }

    @Override
    public void buildFooter(ExportFooterModel efm) {
        buffer.append(efm.getExportUser());
    }

    public StringBuffer getResult(){
        return buffer;
    }
}
