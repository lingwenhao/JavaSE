package action.interpreter.interpreter_c;

/**
 * @author ronin
 * @version V1.0
 * @since 2019/8/27 14:49
 */
public class Client1 {

    public static void main(String[] args) throws Exception {
        //准备上下文
        Context c = new Context("D:\\Repository\\github\\JavaSE\\designpattern\\src\\main\\resources\\InterpreterTest.xml");

        //想要获取c元素的值，也就是如下表达式的值："root/a/b/c"
        //首先要构建解释器的抽象语法树
        ElementExpression root = new ElementExpression("root");
        ElementExpression aEle = new ElementExpression("a");
        ElementExpression bEle = new ElementExpression("b");
        ElementTerminalExpression cEle = new ElementTerminalExpression("c");

        //组合起来
        root.addEle(aEle);
        aEle.addEle(bEle);
        bEle.addEle(cEle);
        //调用
        String ss[] = root.interpret(c);
        System.out.println("c的值是="+ss[0]);
    }
}
