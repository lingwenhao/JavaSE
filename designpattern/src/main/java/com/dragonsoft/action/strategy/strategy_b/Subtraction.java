package com.dragonsoft.action.strategy.strategy_b;

public class Subtraction<T extends Number> implements ICalucatorStrategy<T> {
    @Override
    public Number calucate(T a, T b) {
        return a.doubleValue()-b.doubleValue();
    }
}
