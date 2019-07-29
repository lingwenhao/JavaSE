package structure.adapter.adapter_f_builder.componment.builder;

import structure.adapter.adapter_f_builder.dao.*;
import structure.adapter.adapter_f_builder.domain.Xxjl;

/**
 * XxjlAdapter实际构建者
 */
public class XxjlAdapterSaveBuilder extends XxjlAdapterBuilder {
    private XxjlFjrDao xxjlFjrDao = new XxjlFjrDao();
    private XxjlSjrDao xxjlSjrDao = new XxjlSjrDao();

    @Override
    public XxjlAdapterBuilder buildXxjlFjrDao(Xxjl xxjl) {
        xxjlFjrDao.save(xxjl);
        return this;
    }

    @Override
    public XxjlAdapterBuilder buildXxjlSjrDao(Xxjl xxjl) {
        xxjlSjrDao.save(xxjl);
        return this;
    }

}
