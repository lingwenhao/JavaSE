package structure.flyweight.flyweight_b;

/**
 * @author ronin
 * @version V1.0
 * @desc 抽象的享元类
 * @since 2019/7/30 13:19
 */
public abstract class Flyweight {

    /**内部状态做为成员变量,同一个享元对象其内部状态是一致的*/
    private String intrinsic;

    /**外部状态*/
    private String extrinsic;

    /**
     * 要求享元角色必须接受外部状态
     * @param extrinsic
     */
    public Flyweight(String extrinsic) {
        this.extrinsic = extrinsic;
    }

    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }

    /**
     * 定义业务操作
     *      外部状态extrinsicState在使用时由外部设置，不保存在享元对象中，即使是同一个对象
     * @param extrinsic 外部状态
     */
    public abstract void operate(int extrinsic);

}
