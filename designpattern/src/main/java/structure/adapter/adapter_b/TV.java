package structure.adapter.adapter_b;

/**
 * @author ronin
 * @version V1.0
 * @desc 电视机，使用双孔插座
 *          问题：TV的双孔插头无法使用三孔插座
 *          解决:使用一个适配器解决这个问题
 * @since 2019/7/9 14:45
 */
public class TV implements DoubleHoleSocket{
    /**
     * 参数分别为火线live，零线null
     *
     * @param l
     * @param n
     */
    @Override
    public void electrify(int l, int n) {
        System.out.println("零线通电:"+l);
        System.out.println("火线通电:"+n);
    }
}
