package com.dragonsoft.structure.adapter.adapter_d.dao;

import com.dragonsoft.structure.adapter.adapter_d.domain.Tztg;

public class TztgDao {
    public void save(Tztg tztg) {
        System.out.println("保存通知通告......");
    }

    public boolean sendEmail(String email) {
        System.out.println("通知通告发送邮件......" );
        return true;
    }

    public boolean delete(Tztg tztg) {
        System.out.println("删除通知通告......" );
        return true;
    }
}
