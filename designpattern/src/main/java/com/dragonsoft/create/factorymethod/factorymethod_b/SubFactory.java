package com.dragonsoft.create.factorymethod.factorymethod_b;

public class SubFactory implements OperationFactory{
    @Override
    public Operation createOperation() {
        System.out.println("减法操作工厂...");
        return new Sub();
    }
}
