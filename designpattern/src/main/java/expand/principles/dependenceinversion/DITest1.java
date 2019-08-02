package expand.principles.dependenceinversion;

/**
 * 不使用依赖反转原则
 */
public class DITest1 {
    public static void main(String[] args) {
        Person1 person1 = new Person1();
        person1.receviceEmail(new Email1());
        person1.receviceQQ(new QQ1());
    }
}

/**
 * 通过Person1实现接口消息的功能
 *      缺点:接受QQ要写一个方法，接受邮件要写一个方法
 */
class Person1{
    public void receviceEmail(Email1 email1){
        System.out.println(email1.getEmail());
    }
    public void receviceQQ(QQ1 qq1){
        System.out.println(qq1.getQQ());
    }
}
class Email1 {
   public String getEmail(){
        return "电子邮件信息:HelloWorld";
   }
}
class QQ1 {
   public String getQQ(){
        return "QQ信息:收到了QQ消息";
   }
}

