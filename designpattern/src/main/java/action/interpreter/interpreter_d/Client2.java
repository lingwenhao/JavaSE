package action.interpreter.interpreter_d;

/**
 * 获取多个属性值
 * @author ronin
 * @version V1.0
 * @since 2019/8/27 16:30
 */
public class Client2 {

    public static void main(String[] args) throws Exception {
        //准备上下文
        Context c = new Context("D:\\Repository\\github\\JavaSE\\designpattern\\src\\main\\resources\\InterpreterTest.xml");

        //想要获取d元素的id属性，也就是如下表达式的值："a/b/d$.id$"
        //首先要构建解释器的抽象语法树
        ElementExpression root = new ElementExpression("root");
        ElementExpression aEle = new ElementExpression("a");
        ElementExpression bEle = new ElementExpression("b");
        ElementsExpression dEle = new ElementsExpression("d");
        PropertysTerminalExpression prop = new PropertysTerminalExpression("id");

        //组合
        root.addEle(aEle);
        aEle.addEle(bEle);
        bEle.addEle(dEle);
        dEle.addEle(prop);

        //调用
        String ss[] = root.interpret(c);
        for (String s : ss) {
            System.out.println("d的属性id值是=" + s);
        }
    }
}
