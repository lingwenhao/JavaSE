package action.interpreter.interpreter_b;

import java.util.HashMap;

/**
 * 减法解释器
 */
public class SubExpression extends SymbolExpression {

    /**
     * 左表达式
     */
    private Expression left;
    /**
     * 右表达式
     */
    private Expression right;

    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    /**
     *
     * @param var key:公式 value:变量对应的具体值,如:{a=10,b=20}
     * @return
     */
    @Override
    public int interpret(HashMap<String, Integer> var) {
        return super.getLeft().interpret(var) - super.getRight().interpret(var);
    }

    @Override
    public Expression getLeft() {
        return left;
    }

    @Override
    public void setLeft(Expression left) {
        this.left = left;
    }

    @Override
    public Expression getRight() {
        return right;
    }

    @Override
    public void setRight(Expression right) {
        this.right = right;
    }
}
