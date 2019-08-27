package action.interpreter.interpreter_b;

import java.util.HashMap;

/**
 * 加法解释器
 */
public class AddExpression extends SymbolExpression {

    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * 处理相加
     * @param var key:公式 value:变量对应的具体值,如:{a=10,b=20}
     * @return
     */
    @Override
    public int interpret(HashMap<String, Integer> var) {
        //返回佐表达式对应的值+右表达式对应的值
        return super.getLeft().interpret(var) + super.getRight().interpret(var);
    }
}
