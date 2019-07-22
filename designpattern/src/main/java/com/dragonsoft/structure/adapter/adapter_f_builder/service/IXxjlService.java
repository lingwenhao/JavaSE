package com.dragonsoft.structure.adapter.adapter_f_builder.service;

import com.dragonsoft.structure.adapter.adapter_f_builder.domain.Xxjl;

/**
 * 信息交流:提供两个API
 *      保存
 * 需求：复用公安厅指令模块的发送短信和通知通告模块发送邮件的API
 *
 */
public interface IXxjlService {
    void save(Xxjl xxjl) throws Exception;
    void delete(Xxjl xxjl)throws Exception;
}
