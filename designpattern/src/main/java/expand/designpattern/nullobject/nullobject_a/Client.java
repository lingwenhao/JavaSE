package expand.designpattern.nullobject.nullobject_a;

/**
 * @author ronin
 * @version V1.0
 * @desc
 * @since 2019/7/29 15:07
 */
public class Client {
    public static void main(String[] args) {
        //查询Id=1的图书,代码执行正常
        BookFactory.getBookById(1).show();

        //查询Id=-1的图书,代码执行发生，抛出NullPointerException异常
        //BookFactory.getBookById(-1).show();

        /**
         * 解决方案,先判断该对象是否为空，不为空才能调用方法
         * 缺点:
         *      如果有一万个客户端，那么这个判断空的代码就要在一万个客户端中都进行修改
         *      有一个忘记修改，那么就会就会导致程序出问题
         */
        Book book = BookFactory.getBookById(-1);
        if(null != book) {
            book.show();
        }else {
            System.out.println("该图书不存在......");
        }

    }
}
