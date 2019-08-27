package action.memento.mementor_d;

/**
 * 负责保存模拟运行流程A的对象的备忘录对象
 * @author ronin
 * @version V1.0
 * @since 2019/8/27 11:06
 */
public class FlowAMementoCareTaker {

    /**
     * 记录被保存的备忘录对象
     */
    private FlowAMockMemento memento = null;

    /**
     * 保存备忘录对象
     * @param memento 被保存的备忘录对象
     */
    public void saveMemento(FlowAMockMemento memento){
        this.memento = memento;
    }

    /**
     * 获取被保存的备忘录对象
     * @return 被保存的备忘录对象
     */
    public FlowAMockMemento retriveMemento(){
        return this.memento;
    }
}
