package expand.designpattern.nullobject.nullobject_b;

/**
 * @author ronin
 * @version V1.0
 * @desc
 * @since 2019/7/29 15:02
 */
public class Book extends AbstractBook {
    private Integer id;
    private String name;
    private Double price;

    public Book(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    /**
     * 打印图书信息
     */
    @Override
    public void show(){
        System.out.println(toString());
    }

    @Override
    public boolean isNull() {
        return false;
    }
}
