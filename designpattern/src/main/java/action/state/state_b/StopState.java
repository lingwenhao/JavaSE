package action.state.state_b;

/**
 * @author ronin
 * @version V1.0
 * @desc 结束状态
 * @since 2019/8/2 8:51
 */
public class StopState implements State{

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString(){
        return "Stop State";
    }
}
