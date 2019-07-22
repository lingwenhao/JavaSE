package com.dragonsoft.structure.adapter.adapter_e.service;

import com.dragonsoft.structure.adapter.adapter_e.adapter.XxjlAdapter;
import com.dragonsoft.structure.adapter.adapter_e.dao.XxjlDao;
import com.dragonsoft.structure.adapter.adapter_e.domain.Xxjl;

public class XxjlSerivice implements IXxjlService {
    private XxjlDao xxjlDao = new XxjlDao();
    private XxjlAdapter xxjlAdapter = new XxjlAdapter();

    @Override
    public void save(Xxjl xxjl) {
        xxjlDao.save(xxjl);
        xxjlAdapter.sendMsg("123456789");
        xxjlAdapter.sendEmail("123@qq.com");
    }

    @Override
    public boolean delete(Xxjl xxjl) {
        xxjlDao.delete(xxjl);
        return false;
    }
}
