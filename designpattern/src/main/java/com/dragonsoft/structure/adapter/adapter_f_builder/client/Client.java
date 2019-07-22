package com.dragonsoft.structure.adapter.adapter_f_builder.client;

import com.dragonsoft.structure.adapter.adapter_f_builder.controller.XxjlController;
import com.dragonsoft.structure.adapter.adapter_f_builder.domain.Xxjl;

public class Client {
    private static XxjlController xxjlController = new XxjlController();

    public static void main(String[] args) {
        xxjlController.save(new Xxjl());
        xxjlController.delete(new Xxjl());
    }
}
