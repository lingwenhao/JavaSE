package com.dragonsoft.structure.adapter.adapter_a;

public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.chaging(new VoltageAdapter());
    }
}
