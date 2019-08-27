package action.interpreter.interpreter_b;

import java.util.HashMap;

/**
 * 变量解释器
 */
public class VarExpression extends Expression {
    private String key;//a b c

    public VarExpression(String key) {
        this.key = key;
    }


    /**
     *
     * @param var key:公式 value:变量对应的具体值,如:{a=10,b=20}
     * @return
     */
    @Override
    public int interpret(HashMap<String, Integer> var) {
        return var.get(key);
    }
}
