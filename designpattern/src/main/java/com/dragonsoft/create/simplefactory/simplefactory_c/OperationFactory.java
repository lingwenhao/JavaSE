package com.dragonsoft.create.simplefactory.simplefactory_c;

/**
 * 优点:隐藏创建类的操作
 * 缺点:1.静态方法无法继承,无法形成基于继承的代码结构
 *      2.新增加一个子类的时候，就要对工厂进行修改，如果在创建类的时候要加复杂的逻辑
 *          操作，会导致工厂类冗余而且庞大，维护性变差
 *      3.删除新增某个子类的时候要对工厂类进行操作，违反了开闭原则
 */
public class OperationFactory {
    public static Operation createOperation(String operteionType){
        Operation operation = null;
        switch (operteionType){
            case "+":
                operation = new Add();
                break;
            case "-":
                operation = new Sub();
                break;
            case "*":
                operation = new Mul();
                break;
            case "/":
                operation = new Div();
                break;
        }
        return operation;
    }
}
