package fundation;

import org.junit.Test;

/**
 * @author ronin
 * @version V1.0
 * @since 2019/8/8 9:11
 */
public class Swap {

    @Test
    public void fun(){
        /**
         * 两种方式交换a、b的值
         */
        int a = 10;
        int b = 100;
        //通过中间变量交换两个变量的值
        System.out.println("交换前a:"+a+",交换前b:"+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("交换后a:"+a+",交换后b:"+b);
        //通过异或运算交换两个变量的值
        int c = 10;
        int d = 20;
        System.out.println("交换前c:"+c+",交换前d:"+d);
        c = c ^ d;
        //c = c ^ d;
        d = c ^ d;
        //d = c ^ d ^ d = c ^ (d ^ d) = c ^ 0 = c
        c = c ^ d;
        //c = c ^ d = c ^ d ^ c = c ^ c ^ d = d
        System.out.println("交换前c:"+c+",交换前d:"+d);
        //异或运算法则
        System.out.println("a^a的结果是0:"+(1^1));
        System.out.println("a^0的结果是a:"+(100^0));
    }
}
