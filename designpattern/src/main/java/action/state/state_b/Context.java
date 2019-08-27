package action.state.state_b;

/**
 * @author ronin
 * @version V1.0
 * @desc
 * @since 2019/8/2 8:49
 */
public class Context {
    private State state;
    public Context(){
        state = null;
    }
    public void setState(State state){
        this.state = state;
    }
    public State getState(){
        return state;
    }
}
