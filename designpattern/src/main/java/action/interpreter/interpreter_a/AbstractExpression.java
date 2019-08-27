package action.interpreter.interpreter_a;

/**
 * 抽象表达式
 * @author ronin
 * @version V1.0
 * @since 2019/8/27 13:50
 */
public abstract class AbstractExpression {

    /**
     * 解释的操作
     * @param ctx 上下文对象
     */
    public abstract void interpret(Context ctx);
}
