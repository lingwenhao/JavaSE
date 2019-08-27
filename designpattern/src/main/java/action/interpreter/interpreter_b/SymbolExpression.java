package action.interpreter.interpreter_b;

import java.util.HashMap;

/**
 * 抽象运算符解释器
 *      每个运算符，都只和自己左右两个数字有关
 *      但左右两个数字有可能也是一个解析的结果，无论何种类型，都是Expression的实现类
 */
public class SymbolExpression extends Expression {

    /**
     * 左表达式
     */
    private Expression left;
    /**
     * 右表达式
     */
    private Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    /**
     * 此方法默认空实现，由具体的子类进行实现
     * @param var key:公式 value:变量对应的具体值,如:{a=10,b=20}
     * @return
     */
    @Override
    public int interpret(HashMap<String, Integer> var) {
        return 0;
    }

    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public Expression getRight() {
        return right;
    }

    public void setRight(Expression right) {
        this.right = right;
    }
}
