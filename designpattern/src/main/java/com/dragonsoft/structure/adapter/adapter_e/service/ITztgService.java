package com.dragonsoft.structure.adapter.adapter_e.service;

import com.dragonsoft.structure.adapter.adapter_e.domain.Tztg;

/**
 * 通知通告:提供三个API
 *      保存
 *      删除
 *      发送邮件
 */
public interface ITztgService {
    void save(Tztg tztg);
    boolean delete(Tztg tztg);
    boolean sendEmail(String email);
}
