package structure.adapter.adapter_b;

/**
 * @author ronin
 * @version V1.0
 * @desc 双孔孔插座
 * @since 2019/7/9 14:43
 */
public interface DoubleHoleSocket {
    /**
     * 参数分别为火线live，零线null
     * @param l
     * @param n
     */
    public void electrify(int l, int n);
}
