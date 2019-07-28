package structure.bridge.bridge_b;

/**
 * 桥接类
 */
public abstract class Phone {
    //组合品牌
    private Brand brand;

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    //构造器
    public Phone(Brand brand){
        this.brand = brand;
    }

    public void open() {
        brand.open();
    }

    public void close() {
        brand.close();
    }

    public void call() {
        brand.call();
    }
}
