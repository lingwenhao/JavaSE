package action.interpreter.interpreter_b;

import java.util.HashMap;
import java.util.Stack;

/**
 * 计算器
 */
public class Caculator {
    /**
     * 定义表达式
     */
    private Expression expression;

    /**
     * expressionString: a + b
     * @param expressionString
     */
    public Caculator(String expressionString) {
        //安排先后运算顺序
        Stack<Expression> stack = new Stack<>();
        //把表达式拆分成字符数组
        char[] chars = expressionString.toCharArray();
        Expression left = null;
        Expression right = null;
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]){
                case '+':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new AddExpression(left,right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new SubExpression(left,right));
                    break;
                default:
                    //如果不是运算符，把具体的值压入栈中
                    stack.push(new VarExpression(String.valueOf(chars[i])));
                    break;
            }
        }

        this.expression = stack.pop();
    }

    public int run(HashMap<String,Integer> var){
        return this.expression.interpret(var);
    }
}
