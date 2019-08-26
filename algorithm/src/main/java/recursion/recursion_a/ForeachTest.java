package recursion.recursion_a;

/**
 * 递归打印1~100
 * @author ronin
 * @version V1.0
 * @since 2019/8/26 9:33
 */
public class ForeachTest {
    public static void main(String[] args) {
        foreach(0);
    }
    private static void foreach(int i){
        if(i>100){
            return;
        }
        System.out.println(i);
        foreach(i+1);
    }
}
