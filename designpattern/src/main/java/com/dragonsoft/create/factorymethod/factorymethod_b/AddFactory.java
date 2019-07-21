package com.dragonsoft.create.factorymethod.factorymethod_b;

public class AddFactory implements OperationFactory{
    @Override
    public Operation createOperation() {
        System.out.println("加法操作工厂...");
        return new Add();
    }
}
