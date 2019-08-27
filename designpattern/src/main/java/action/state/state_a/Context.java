package action.state.state_a;

/**
 * 定义客户感兴趣的接口，通常会维护一个State类型的对象实例
 * @author ronin
 * @version V1.0
 * @since 2019/8/27 9:13
 */
public class Context {

    /**
     * 持有一个State类型的对象实例
     */
    private State state;

    /**
     * 设置实现State的对象的实例
     * @param state 实现State的对象的实例
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * 用户感兴趣的接口方法
     * @param sampleParameter 示意参数
     */
    public void request(String sampleParameter) {
        //在处理中，会转调state来处理
        state.handle(sampleParameter);
    }
}
