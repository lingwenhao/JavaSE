package create.abstractfactory.abstractfactory_g;


/**
 * @author ronin
 * @version V1.0
 * @since 2019/8/7 16:13
 */
public class DellFactory implements AbstractFactory{

    /**
     * 构造方法在此处无意义,只是标识一个这个类是华硕
     */
    public DellFactory() {
        System.out.println("Dell电脑工厂准备生产华硕电脑,Dell电脑搭载Intel牌CPU和技嘉主板和索尼内存条");
    }

    /**
     * 创建硬件
     *
     * @param type
     * @return
     */
    @Override
    public Object createHardware(int type) {
        Object obejct = null;
        //type为1表示创建CPU，type为2表示创建主板 3表示创建内存
        if(type==1){
            obejct = new IntelCPU(1156);
        }else if(type==2){
            obejct = new GAMainboard(1156);
        }else if(type == 3) {
            obejct = new SonyMemory();
        }
        return obejct;
    }
}
