package create.abstractfactory.abstractfactory_g;


/**
 * 联想工厂:组装联想电脑，联想电脑搭载 AMD CPU和微星主板
 * @author ronin
 * @version V1.0
 * @since 2019/8/7 14:52
 */
public class LenovoFactory implements AbstractFactory{

    /**
     * 构造方法在此处无意义,只是标识一个这个类是华硕
     */
    public LenovoFactory() {
        System.out.println("联想电脑工厂准备生产联想电脑,联想电脑搭载AMD牌CPU和MSI主板");
    }

    /**
     * 创建硬件
     *
     * @param type
     * @return
     */
    @Override
    public Object createHardware(int type) {
        Object object = null;
        //type为1表示创建CPU，type为2表示创建主板
        if(type==1){
            object = new AMDCPU(939);
        }else if(type==2){
            object = new MSIMainboard(939);
        }
        return object;
    }
}
