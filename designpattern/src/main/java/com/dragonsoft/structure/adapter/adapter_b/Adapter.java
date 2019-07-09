package com.dragonsoft.structure.adapter.adapter_b;

/**
 * @author ronin
 * @version V1.0
 * @desc 所有双座插头适配器
 * @since 2019/7/9 14:48
 */
public class Adapter  implements ThreeHoleSocket{

    private DoubleHoleSocket doubleHoleSocket;

    /**
     * 创建适配器地时候，需要把双插设备接入进来
     * 需要把被适配的对象的引用传递进来
     * @param doubleHoleSocket
     */
    public Adapter(DoubleHoleSocket doubleHoleSocket) {
        this.doubleHoleSocket = doubleHoleSocket;
    }


    /**
     * 参数分别为火线live，零线null，地线earth
     *
     * @param l
     * @param n
     * @param e
     */
    @Override
    public void electrify(int l, int n, int e) {
        //实际上调用了被适配设备的双插通电，地线e被丢弃了。
        doubleHoleSocket.electrify(l, n);
    }


}
