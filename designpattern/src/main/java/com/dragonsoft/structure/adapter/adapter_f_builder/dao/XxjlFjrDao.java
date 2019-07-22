package com.dragonsoft.structure.adapter.adapter_f_builder.dao;

import com.dragonsoft.structure.adapter.adapter_f_builder.domain.Xxjl;

public class XxjlFjrDao implements IXxjlDao {
    @Override
    public boolean save(Xxjl xxjl) {
        System.out.println("保存发件人发送的信息交流......");
        return true;
    }
    @Override
    public boolean delete(Xxjl xxjl) {
        System.out.println("删除发件人发送的信息交流......");
        return true;
    }
}
