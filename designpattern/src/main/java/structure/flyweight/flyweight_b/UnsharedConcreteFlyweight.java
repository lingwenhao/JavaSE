package structure.flyweight.flyweight_b;

/**
 * @author ronin
 * @version V1.0
 * @desc 不需要共享的享元对象:通常是将被共享的享元对象作为子节点，组合出来的对象
 * @since 2019/7/30 13:38
 */
public class UnsharedConcreteFlyweight extends Flyweight {

    /**
     * 外部状态
     * @param extrinsic
     */
    public UnsharedConcreteFlyweight(String extrinsic) {
        super(extrinsic);
    }

    /**
     * 定义业务操作
     *
     * @param extrinsic
     */
    @Override
    public void operate(int extrinsic) {
        System.out.println("不共享的具体Flyweight:" + extrinsic);
    }
}
