package com.dragonsoft.structure.adapter.adapter_f_builder.componment.builder;

import com.dragonsoft.structure.adapter.adapter_f_builder.componment.adapter.XxjlAdapter;
import com.dragonsoft.structure.adapter.adapter_f_builder.domain.Xxjl;

public class XxjlDirector {
    private XxjlAdapterBuilder xxjlAdapter;
    private XxjlAdapterBaseBuilder xxjlAdapterBaseConcerteBuilder  = new XxjlAdapterBaseConcerteBuilder();
    public XxjlDirector() {

    }

    public XxjlDirector(XxjlAdapter xxjlAdapter) {
        this.xxjlAdapter = new XxjlAdapterSaveBuilder();
    }

    public void setXxjlAdapter(XxjlAdapterBuilder xxjlAdapter) {
        this.xxjlAdapter = xxjlAdapter;
    }

    public void save(Xxjl xxjl, String phoneNumber, String email){
        xxjlAdapter.buildXxjlSjrDao(xxjl)
                   .buildXxjlFjrDao(xxjl);
        xxjlAdapterBaseConcerteBuilder.build(xxjl,phoneNumber,email);
    }

    public void delete(Xxjl xxjl, String phoneNumber, String email){
        xxjlAdapter.buildXxjlSjrDao(xxjl)
                   .buildXxjlFjrDao(xxjl);
        xxjlAdapterBaseConcerteBuilder.build(xxjl,phoneNumber,email);
    }
}
