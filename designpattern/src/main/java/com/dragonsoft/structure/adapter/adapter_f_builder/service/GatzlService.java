package com.dragonsoft.structure.adapter.adapter_f_builder.service;

import com.dragonsoft.structure.adapter.adapter_f_builder.dao.GatzlDao;
import com.dragonsoft.structure.adapter.adapter_f_builder.domain.Gatzl;

public class GatzlService implements IGatzlService {
    private GatzlDao gatzlDao = new GatzlDao();

    @Override
    public void save(Gatzl gatzl) {
        gatzlDao.save(gatzl);
    }

    @Override
    public boolean delete(Gatzl gatzl) {
        return gatzlDao.delete(gatzl);
    }

    @Override
    public boolean sendMsg(String phoneNumber) {
        return gatzlDao.sendMsg(phoneNumber);
    }
}
