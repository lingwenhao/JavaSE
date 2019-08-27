package action.memento.mementor_b;

public class Client {
    public static void main(String[] args) {
        //获取原始对象
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        //设置原始状态
        originator.setState("状态#1:血量100");
        //保存此状态
        careTaker.add(originator.saveMemento());

        originator.setState("状态#2:血量80");
        careTaker.add(originator.saveMemento());

        originator.setState("状态#3:血量50");
        careTaker.add(originator.saveMemento());

        System.out.println("获取当前状态:"+originator.getState());

        //希望得到状态#1
        Memento memento = careTaker.getMemento(0);
        originator.getStateFromMemento(memento);
        //并将originator的状态恢复到状态1
        System.out.println("当前状态是:"+originator.getState());
    }
}
