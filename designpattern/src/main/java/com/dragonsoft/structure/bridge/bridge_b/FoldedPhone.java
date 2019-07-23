package com.dragonsoft.structure.bridge.bridge_b;

/**
 *  折叠式手机
 */
public class FoldedPhone extends Phone{
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("打开折叠样式手机");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("关闭折叠样式手机");
    }

    @Override
    public void call() {
        super.call();
        System.out.println("折叠样式手机打电话");
    }
}
