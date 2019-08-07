package create.abstractfactory.abstractfactory_g;


/**
 * 华硕工厂:组装华硕电脑,华硕电脑搭载Intel CPU和技嘉主板
 * @author ronin
 * @version V1.0
 * @since 2019/8/7 14:50
 */
public class AsusFactory implements AbstractFactory{

    /**
     * 构造方法在此处无意义,只是标识一个这个类是华硕
     */
    public AsusFactory() {
        System.out.println("华硕电脑工厂准备生产华硕电脑,华硕电脑搭载Intel牌CPU和技嘉主板");
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
        //type为1表示创建CPU，type为2表示创建主板
        if(type==1){
            obejct = new IntelCPU(1156);
        }else if(type==2){
            obejct = new GAMainboard(1156);
        }
        return obejct;
    }
}
