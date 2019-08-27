package action.memento.mementor_a;

/**
 * 负责保存备忘录的对象
 * @author ronin
 * @version V1.0
 * @since 2019/8/27 11:21
 */
public class Caretaker {

    /**
     * 记录被保存的备忘录对象
     */
    private Memento memento = null;

    /**
     * 保存备忘录对象
     * @param memento 被保存的备忘录对象
     */
    public void saveMemento(Memento memento){
        this.memento = memento;
    }

    /**
     * 获取被保存的备忘录对象
     * @return 被保存的备忘录对象
     */
    public Memento retriveMemento(){
        return this.memento;
    }
}
