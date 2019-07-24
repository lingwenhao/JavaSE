package com.dragonsoft.structure.bridge.bridge_b;

/**
 * 获取手机
 */
public class Client {
    public static void main(String[] args) {
        //获取折叠式小米手机：样式+品牌
            //多态
        Brand ximi = new Ximi();
        Phone ximiFolded = new FoldedPhone(ximi);
        ximiFolded.open();
        ximiFolded.call();
        ximiFolded.close();
        System.out.println("--------------------------------------");
        //获取折叠式Vivo手机：样式+品牌
        Phone vivoFolded = new FoldedPhone(new Ximi());
        vivoFolded.open();
        vivoFolded.call();
        vivoFolded.close();

        System.out.println("=========================================");
        //获取直立式小米手机：样式+品牌
//        Phone ximiUpRight = new UpRightPhone(new Ximi());
//        ximiUpRight.open();
//        ximiUpRight.call();
//        ximiUpRight.close();

        System.out.println("--------------------------------------");
        //获取直立式Vivo手机：样式+品牌
//        Phone vivoUpRight = new UpRightPhone(new Vivo());
//        vivoUpRight.open();
//        vivoUpRight.call();
//        vivoUpRight.close();

    }
}
