package com.dragonsoft.identify;


import org.junit.Test;

/**
 * @author ronin
 * @version V1.0
 * @desc 测试instanceof关键字
 * @since 2019/7/10 9:12
 */
public class InstanceOfTest {

    /**
     * 测试继承时子类是不是父类
     */
    @Test
    public void testClassExtend(){
        A aa = new AA();
        System.out.println(aa instanceof AA);//true
        System.out.println(aa instanceof A);//true
    }

    /**
     * 测试实现时实现类是不是instanceof父接口
     */
    @Test
    public void testImplementInterface(){
        B bb = new BB();
        System.out.println(bb instanceof BB);//true
        System.out.println(bb instanceof B);//true
    }

    public class A{

    }

    public class AA extends A{

    }

    public interface B{

    }

    public class BB implements B{

    }
}

