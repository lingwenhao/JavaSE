package structure.adapter.adapter_f_builder.componment.builder;

import structure.adapter.adapter_f_builder.componment.adapter.XxjlAdapter;
import structure.adapter.adapter_f_builder.domain.Xxjl;

/**
 * XxjlAdapter抽象执行者
 */
public abstract class XxjlAdapterBuilder {
    private XxjlAdapter xxjlAdapter = new XxjlAdapter();

    /**
     * 执行发件人Dao保存/删除Xxjl行为
     * @param xxjl
     */
    public abstract XxjlAdapterBuilder buildXxjlFjrDao(Xxjl xxjl);

    /**
     * 执行收件人Dao保存/删除Xxjl行为
     * @param xxjl
     */
    public abstract XxjlAdapterBuilder buildXxjlSjrDao(Xxjl xxjl);

}
