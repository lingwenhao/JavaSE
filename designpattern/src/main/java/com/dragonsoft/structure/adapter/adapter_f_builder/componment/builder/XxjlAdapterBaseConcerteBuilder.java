package com.dragonsoft.structure.adapter.adapter_f_builder.componment.builder;

import com.dragonsoft.structure.adapter.adapter_f_builder.dao.GatzlDao;
import com.dragonsoft.structure.adapter.adapter_f_builder.dao.TztgDao;
import com.dragonsoft.structure.adapter.adapter_f_builder.dao.XxjlOpenfireDao;
import com.dragonsoft.structure.adapter.adapter_f_builder.domain.Xxjl;

public class XxjlAdapterBaseConcerteBuilder extends XxjlAdapterBaseBuilder {
    private XxjlOpenfireDao xxjlOpenfireDao = new XxjlOpenfireDao();
    private GatzlDao gtzlDao = new GatzlDao();
    private TztgDao tztgDao = new TztgDao();

    @Override
    public XxjlAdapterBaseBuilder buildXxjlOpenfireDao(Xxjl xxjl) {
        xxjlOpenfireDao.sendXxjlNotice(xxjl);
        return this;
    }

    @Override
    public XxjlAdapterBaseBuilder buildGatzlDao(String phoneNumber) {
        gtzlDao.sendMsg(phoneNumber);
        return this;
    }

    @Override
    public XxjlAdapterBaseBuilder buildTztgDao(String email) {
        tztgDao.sendEmail(email);
        return this;
    }


}
