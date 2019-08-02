package expand.designpattern.nullobject.nullobject_b;

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
        BookFactory.getBookById(-1).show();

        /**
         * 由客户端定制提示信息
         */
        AbstractBook book = BookFactory.getBookById(-2);
        if(book.isNull()){
            System.out.println("我是由客户端定制的提示信息......");
        }else {
            book.show();
        }
    }
}
