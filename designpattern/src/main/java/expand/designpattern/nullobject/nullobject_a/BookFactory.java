package expand.designpattern.nullobject.nullobject_a;

/**
 * @author ronin
 * @version V1.0
 * @desc
 * @since 2019/7/29 15:03
 */
public class BookFactory {
    public static Book getBookById(Integer id){
        Book book = null;
        switch (id){
            case 1 :
                book =  new Book(1,"数据结构",20.0);
                break;
            case 2:
                book =  new Book(2,"设计模式",30.0);
            default:
                //可以省略，book初始值就为null
                book = null;
                break;
        }
        return book;
    }
}
