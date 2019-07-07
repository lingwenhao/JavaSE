package com.dragonsoft.action.strategyplus;

public interface ICalucatorStrategy<T extends Number> {
    Number calucate(T a, T b);
}
