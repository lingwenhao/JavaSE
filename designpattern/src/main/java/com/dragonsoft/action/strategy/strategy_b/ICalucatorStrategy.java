package com.dragonsoft.action.strategy.strategy_b;

public interface ICalucatorStrategy<T extends Number> {
    Number calucate(T a, T b);
}
