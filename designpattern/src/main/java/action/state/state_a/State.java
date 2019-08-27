package action.state.state_a;

/**
 * 封装与Context的一个特定状态相关的行为
 * @author ronin
 * @version V1.0
 * @since 2019/8/27 9:10
 */
public interface State {

    /**
     * 状态对应的处理
     * @param sampleParameter 示例参数，说明可以传入参数，具体传入
     *             什么样的参数，传入几个参数，由具体应用来具体分析
     */
    public void handle(String sampleParameter);
}
