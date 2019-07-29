package structure.adapter.adapter_f_builder.service;

import structure.adapter.adapter_f_builder.componment.builder.XxjlAdapterBuilder;
import structure.adapter.adapter_f_builder.componment.builder.XxjlAdapterSaveBuilder;
import structure.adapter.adapter_f_builder.componment.builder.XxjlDirector;
import structure.adapter.adapter_f_builder.domain.Xxjl;

public class XxjlSerivice implements IXxjlService {
    /**
     * 保存行为构建者
     */
    private XxjlAdapterBuilder xxjlAdapterSaveBuilder = new XxjlAdapterSaveBuilder();
    /**
     * 删除行为构建者
     */
    private XxjlAdapterBuilder xxjlAdapterDeleteBuilder = new XxjlAdapterSaveBuilder();

    /**
     * 指挥者
     */
    private XxjlDirector xxjlDirector = new XxjlDirector();

    @Override
    public void save(Xxjl xxjl) throws Exception{
        //设置实际构建者
        xxjlDirector.setXxjlAdapter(xxjlAdapterSaveBuilder);
        xxjlDirector.save(xxjl,"123","123@qq.com");

    }

    @Override
    public void delete(Xxjl xxjl)throws Exception{
        //重置实际构建者
        xxjlDirector.setXxjlAdapter(xxjlAdapterDeleteBuilder);
        xxjlDirector.save(xxjl,"123","123@qq.com");
    }
}
