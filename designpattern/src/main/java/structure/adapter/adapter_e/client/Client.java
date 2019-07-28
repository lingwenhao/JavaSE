package structure.adapter.adapter_e.client;

import structure.adapter.adapter_e.controller.XxjlController;
import structure.adapter.adapter_e.domain.Xxjl;

public class Client {
    private static XxjlController xxjlController = new XxjlController();

    public static void main(String[] args) {
        xxjlController.save(new Xxjl());
        xxjlController.delete(new Xxjl());
    }
}
