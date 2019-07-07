package com.dragonsoft.action.strategy;

public class Subtraction implements ICalucatorStrategy {
    @Override
    public Integer calucate(int a, int b) {
        return a - b;
    }
}
