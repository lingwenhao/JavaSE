package structure.facade.facade_a;

import sun.security.jca.GetInstance;

/**
 * 电影幕布
 */
public class Screen {
    private static Screen screen = new Screen();

    public static Screen getInstance(){
        return screen;
    }


    /**
     * 屏幕上升
     */
    public void up() {
        System.out.println("screen up......");
    }

    /**
     * 屏幕下降
     */
    public void down() {
        System.out.println("screen down......");
    }

    /**
     * 屏幕灯光打开
     */
    public void light() {
        System.out.println("light......");
    }
}
