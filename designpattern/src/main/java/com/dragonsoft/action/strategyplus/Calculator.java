package com.dragonsoft.action.strategyplus;

public class Calculator<T extends Number> {
    private ICalucatorStrategy calucatorStrategy;

    public Calculator(ICalucatorStrategy calucatorStrategy){
        this.calucatorStrategy = calucatorStrategy;
    }

    public Number calculate(T a,T b){
        return this.calucatorStrategy.calucate(a,b);
    }
}
