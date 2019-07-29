package structure.adapter.adapter_f_builder.componment.builder;

import structure.adapter.adapter_f_builder.componment.adapter.XxjlAdapter;
import structure.adapter.adapter_f_builder.domain.Xxjl;

/**
 * XxjlAdapter抽象执行者
 */
public abstract class XxjlAdapterBaseBuilder {
    private XxjlAdapter xxjlAdapter = new XxjlAdapter();
    /**
     * 执行OpenfireDao保存Xxjl行为
     * @param xxjl
     */
    public abstract XxjlAdapterBaseBuilder buildXxjlOpenfireDao(Xxjl xxjl);

    /**
     * 执行公安厅指令Dao发送短信行为
     * @param phoneNumber
     */
    public abstract XxjlAdapterBaseBuilder buildGatzlDao(String phoneNumber);

    /**
     * 执行通知通告Dao发送邮件行为
     * @param email
     */
    public abstract XxjlAdapterBaseBuilder buildTztgDao(String email);

    /**
     * 执行基础构建
     */
    public void build(Xxjl xxjl,String phoneNumber,String email){
        buildXxjlOpenfireDao(xxjl)
        .buildTztgDao(phoneNumber)
        .buildTztgDao(email);
    }

}
