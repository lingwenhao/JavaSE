package com.dragonsoft.structure.adapter.adapter_e.adapter;

import com.dragonsoft.structure.adapter.adapter_e.dao.GatzlDao;
import com.dragonsoft.structure.adapter.adapter_e.dao.TztgDao;
import com.dragonsoft.structure.adapter.adapter_e.service.IGatzlService;
import com.dragonsoft.structure.adapter.adapter_e.service.ITztgService;

public class XxjlAdapter extends AbstractXxjlAdapter {
    private GatzlDao gatzlDao = new GatzlDao();
    private TztgDao tztgDao = new TztgDao();

    @Override
    public boolean sendMsg(String phoneNumber) {
        IGatzlService iGatzlService = new AbstractXxjlAdapter() {
            @Override
            public boolean sendMsg(String phoneNumber) {
                return gatzlDao.sendMsg(phoneNumber);
            }
        };
        return iGatzlService.sendMsg(phoneNumber);
    }

    @Override
    public boolean sendEmail(String email) {
        ITztgService iTztgService = new AbstractXxjlAdapter() {
            @Override
            public boolean sendEmail(String email) {
                return tztgDao.sendEmail(email);
            }
        };
        return iTztgService.sendEmail(email);
    }
}
