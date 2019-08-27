package action.interpreter.interpreter_d;

/**
 * 用于处理自定义Xml取值表达式的接口
 * @author ronin
 * @version V1.0
 * @since 2019/8/27 13:57
 */
public abstract class ReadXmlExpression {

    /**
     * 解释表达式
     * @param c 上下文
     * @return 解析过后的值，为了通用，可能是单个值，也可能是多个值，
     *         因此就返回一个数组
     */
    public abstract String[] interpret(Context c);
}
