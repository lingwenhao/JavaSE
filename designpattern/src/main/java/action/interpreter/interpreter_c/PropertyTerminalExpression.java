package action.interpreter.interpreter_c;

/**
 * 属性作为终结符对应的解释器
 * @author ronin
 * @version V1.0
 * @since 2019/8/27 14:46
 */
public class PropertyTerminalExpression extends ReadXmlExpression{

    /**
     * 属性的名字
     */
    private String propName;

    public PropertyTerminalExpression(String propName){
        this.propName = propName;
    }

    @Override
    public String[] interpret(Context c) {
        //直接获取最后的元素的属性的值
        String[] ss = new String[1];
        ss[0] = c.getPreEle().getAttribute(this.propName);
        return ss;
    }
}
