package com.dragonsoft.create.factorymethod.factorymethod_b;

public class MulFactory implements OperationFactory{
    @Override
    public Operation createOperation() {
        System.out.println("乘法工厂类...");
        return new Mul();
    }
}
