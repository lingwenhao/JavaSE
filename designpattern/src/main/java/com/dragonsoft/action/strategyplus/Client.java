package com.dragonsoft.action.strategyplus;

public class Client {
    public static void main(String[] args) {
        //Addtion<Integer> addtion = new Addtion<Integer>();
        Addtion<Byte> addtion = new Addtion<Byte>();
        Calculator calculator = new Calculator(addtion);
        Number result = calculator.calculate(1.2, 5);
        System.out.println(result);

    }
}
