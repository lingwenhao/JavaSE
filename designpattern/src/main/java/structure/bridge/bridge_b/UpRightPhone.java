package structure.bridge.bridge_b;

/**
 * 直立式手机
 */
public class UpRightPhone extends Phone{
    
    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        //super.open();
        super.getBrand().open();
        System.out.println("打开直立式手机");
    }

    @Override
    public void close() {
        //super.close();
        super.getBrand().close();
        System.out.println("关闭直立式手机");
    }

    @Override
    public void call() {
        //super.call();
        super.getBrand().call();
        System.out.println("直立式手机打电话");
    }
}
