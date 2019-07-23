package com.dragonsoft.structure.bridge.bridge_b;

public abstract class Phone {
    //组合品牌
    private Brand brand;

    //构造器
    public Phone(Brand brand){
        this.brand = brand;
    }

    public void open() {
        brand.open();
    }

    public void close() {
        brand.close();
    }

    public void call() {
        brand.call();
    }
}
