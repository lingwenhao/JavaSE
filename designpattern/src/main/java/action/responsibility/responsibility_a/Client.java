package action.responsibility.responsibility_a;

/**
 * @author ronin
 * @version V1.0
 * @since 2019/8/27 18:00
 */
public class Client {
    public static void main(String[] args) {
        //先要组装职责链
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();

        h1.setSuccessor(h2);
        //然后提交请求
        h1.handleRequest();
    }
}
