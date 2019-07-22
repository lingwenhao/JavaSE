package com.dragonsoft.structure.adapter.adapter_d.service;

import com.dragonsoft.structure.adapter.adapter_d.dao.XxjlDao;
import com.dragonsoft.structure.adapter.adapter_d.domain.Xxjl;

public class XxjlSerivice implements IXxjlService{
    private XxjlDao xxjlDao = new XxjlDao();

    @Override
    public void save(Xxjl xxjl) {
        xxjlDao.save(xxjl);
    }

    @Override
    public boolean delete(Xxjl xxjl) {
        xxjlDao.delete(xxjl);
        return false;
    }
}
