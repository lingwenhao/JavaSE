package com.dragonsoft.action.vistor.vistor_a;

public class Man extends Person {
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
