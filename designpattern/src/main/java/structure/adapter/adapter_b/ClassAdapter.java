package structure.adapter.adapter_b;

/**
 * @author ronin
 * @version V1.0
 * @desc 电机机类的专用适配器类
 * @since 2019/7/9 14:53
 */
public class ClassAdapter extends TV implements ThreeHoleSocket{
    /**
     * 参数分别为火线live，零线null，地线earth
     *
     * @param l
     * @param n
     * @param e
     */
    @Override
    public void electrify(int l, int n, int e) {
        super.electrify(l, n);
    }

}
