package principles.dependenceinversion;

/**
 * 遵循依赖反转原则
 * 面向接口编程
 *      基于接口传递实现依赖
 */
public class DITest2 {
    public static void main(String[] args) {
        //面向接口编程
        Person2 person2 = new Person2();
        person2.getMessage(new Email2());
        person2.getMessage(new QQ2());
    }

}

class Person2 {
    public void getMessage(MessageInterface messageInterface) {
        System.out.println(messageInterface.sendMessage());
    }
}

interface MessageInterface {
    String sendMessage();
}

class Email2 implements MessageInterface{
    @Override
    public String sendMessage() {
        return  "电子邮件信息:HelloWorld";
    }
}

class QQ2 implements MessageInterface{
    @Override
    public String sendMessage() {
        return "QQ信息:收到了QQ消息";
    }
}