package com.dragonsoft.structure.adapter.adapter_f_builder.service;

import com.dragonsoft.structure.adapter.adapter_f_builder.dao.TztgDao;
import com.dragonsoft.structure.adapter.adapter_f_builder.domain.Tztg;

public class TztgService implements ITztgService {
    private TztgDao tztgDao = new TztgDao();

    @Override
    public void save(Tztg tztg) {
        tztgDao.save(tztg);
    }

    @Override
    public boolean delete(Tztg tztg) {
        return tztgDao.delete(tztg);
    }

    @Override
    public boolean sendEmail(String email) {
        return  tztgDao.sendEmail(email);
    }

}