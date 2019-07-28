package action.memento.mementor_a;
import	java.util.ArrayList;
import java.util.List;

/**
 * 守护者对象:负责保存多个备忘录对象，使用集合管理吗，提高效率
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList <Memento>();

    /**
     * 添加备忘录状态对象
     * @param memento
     */
    public void add(Memento memento){
        mementoList.add(memento);
    }

    /**
     * 获取备忘录状态对象
     * @param index
     * @return
     */
    public Memento getMemento(int index){
        return mementoList.get(index);
    }
}
