package structure.flyweight.flyweight_b;

/**
 * @author ronin
 * @version V1.0
 * @desc 具体的享元类
 * @since 2019/7/30 13:22
 */
public class ConcreteFlyweight extends Flyweight {

    /**
     * 接收外部状态
      * @param extrinsic
     */
    public ConcreteFlyweight(String extrinsic) {
        super(extrinsic);
    }

    /**
     * 定义业务操作
     *
     * @param extrinsic
     */
    @Override
    public void operate(int extrinsic) {
        System.out.println("具体的享元类:"+extrinsic);
    }
}
