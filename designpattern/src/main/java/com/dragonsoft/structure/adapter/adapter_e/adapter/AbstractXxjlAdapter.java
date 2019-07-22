package com.dragonsoft.structure.adapter.adapter_e.adapter;

import com.dragonsoft.structure.adapter.adapter_e.domain.Gatzl;
import com.dragonsoft.structure.adapter.adapter_e.domain.Tztg;
import com.dragonsoft.structure.adapter.adapter_e.domain.Xxjl;
import com.dragonsoft.structure.adapter.adapter_e.service.IGatzlService;
import com.dragonsoft.structure.adapter.adapter_e.service.ITztgService;
import com.dragonsoft.structure.adapter.adapter_e.service.IXxjlService;

public class AbstractXxjlAdapter implements IGatzlService,ITztgService {
    @Override
    public void save(Gatzl gatzl) {

    }

    @Override
    public boolean delete(Gatzl gatzl) {
        return false;
    }

    @Override
    public boolean sendMsg(String phoneNumber) {
        return false;
    }

    @Override
    public void save(Tztg tztg) {

    }

    @Override
    public boolean delete(Tztg tztg) {
        return false;
    }

    @Override
    public boolean sendEmail(String email) {
        return false;
    }
}
