package structure.bridge.bridge_b;

/**
 * 获取手机
 */
public class Client {
    public static void main(String[] args) {
        //获取折叠式小米手机：样式+品牌
        FoldedPhone ximiFolded = new FoldedPhone(new Ximi());
        ximiFolded.open();
        ximiFolded.call();
        ximiFolded.close();

        System.out.println("--------------------------------------");
        //获取折叠式Vivo手机：样式+品牌
        FoldedPhone vivoFolded = new FoldedPhone(new Ximi());
        vivoFolded.open();
        vivoFolded.call();
        vivoFolded.close();

        System.out.println("=========================================");
        //获取直立式小米手机：样式+品牌
        UpRightPhone ximiUpRight = new UpRightPhone(new Ximi());
        ximiUpRight.open();
        ximiUpRight.call();
        ximiUpRight.close();

        System.out.println("--------------------------------------");
        //获取直立式Vivo手机：样式+品牌
        UpRightPhone vivoUpRight = new UpRightPhone(new Vivo());
        vivoUpRight.open();
        vivoUpRight.call();
        vivoUpRight.close();
    }
}
