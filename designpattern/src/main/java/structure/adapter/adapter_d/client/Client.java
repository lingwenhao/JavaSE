package structure.adapter.adapter_d.client;

import structure.adapter.adapter_d.controller.XxjlController;
import structure.adapter.adapter_d.domain.Xxjl;

public class Client {
    private static  XxjlController xxjlController = new XxjlController();

    public static void main(String[] args) {
        xxjlController.save(new Xxjl());
        xxjlController.delete(new Xxjl());
    }
}
