package com.dragonsoft.structure.adapter.adapter_d.service;

import com.dragonsoft.structure.adapter.adapter_d.adapter.AbstractXxjlAdapter;
import com.dragonsoft.structure.adapter.adapter_d.dao.GatzlDao;
import com.dragonsoft.structure.adapter.adapter_d.dao.TztgDao;
import com.dragonsoft.structure.adapter.adapter_d.dao.XxjlDao;
import com.dragonsoft.structure.adapter.adapter_d.domain.Xxjl;

public class XxjlAdapterService extends AbstractXxjlAdapter {
    private GatzlDao gatzlDao = new GatzlDao();
    private TztgDao tztgDao = new TztgDao();
    private XxjlDao xxjlDao = new XxjlDao();

    @Override
    public void save(Xxjl xxjl) {
        xxjlDao.save(xxjl);
        gatzlDao.sendMsg("123456789");
        tztgDao.sendEmail("123@qq.com");
    }

}
