package structure.adapter.adapter_f_builder.service;

import structure.adapter.adapter_f_builder.domain.Gatzl;

/**
 * 公安厅指令:提供三个API
 *      保存
 *      删除
 *      发送短信
 */
public interface IGatzlService {
    void save(Gatzl gatzl);
    boolean delete(Gatzl gatzl);
    boolean sendMsg(String phoneNumber);
}
