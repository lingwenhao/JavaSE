package action.interpreter.interpreter_b;

import java.util.HashMap;

/**
 * 表达式抽象类
 */
public abstract class Expression {
    /**
     * 解释公式和数值之间的关系
     *
     * @param var key:公式 value:变量对应的具体值,如:{a=10,b=20}
     * @return
     */
    public abstract int interpret(HashMap<String,Integer> var);
}
