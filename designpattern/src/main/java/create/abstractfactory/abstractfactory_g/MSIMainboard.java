package create.abstractfactory.abstractfactory_g;


/**
 * 微星主板
 * @author ronin
 * @version V1.0
 * @since 2019/8/7 15:09
 */
public class MSIMainboard implements MainboardApi{

    /**
     * CPU插槽的孔数
     */
    private int cpuHoles = 0;

    /**
     * 构造方法，传入CPU插槽的孔数
     * @param cpuHoles CPU插槽的孔数
     */
    public MSIMainboard(int cpuHoles){
        this.cpuHoles = cpuHoles;
    }

    /**
     * 给主板安装CPU
     */
    @Override
    public void installCPU() {
        System.out.println("微星主板,cpuHoles=" + cpuHoles);

    }
}
