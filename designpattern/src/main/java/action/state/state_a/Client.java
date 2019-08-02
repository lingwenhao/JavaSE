package action.state.state_a;

/**
 * @author ronin
 * @version V1.0
 * @desc
 * @since 2019/8/2 8:52
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();

        //创建一个开始状态
        StartState startState = new StartState();
        //针对开始状态执行特定的操作
        startState.doAction(context);
        System.out.println(context.getState().toString());

        //创建一个结束状态
        StopState stopState = new StopState();
        //针对结束状态执行特性的操作
        stopState.doAction(context);
        System.out.println(context.getState().toString());
    }
}
