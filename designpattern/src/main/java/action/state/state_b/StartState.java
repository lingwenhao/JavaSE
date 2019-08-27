package action.state.state_b;

/**
 * @author ronin
 * @version V1.0
 * @desc 开始状态
 * @since 2019/8/2 8:50
 */
public class StartState implements State{

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    @Override
    public String toString(){
        return "Start State";
    }
}
