package action.memento.mementor_b;

/**
 * 原始对象
 */
public class Originator {
    /**状态信息*/
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * 保存状态
     * @return
     */
    public Memento saveMemento(){
        return new Memento(state);
    }

    /**
     * 得到状态,并且恢复状态
     * @return
     */
    public void getStateFromMemento(Memento memento){
        state = memento.getState();
    }
}
