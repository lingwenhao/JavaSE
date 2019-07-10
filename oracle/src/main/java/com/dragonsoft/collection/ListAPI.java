package com.dragonsoft.collection;

import org.junit.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ListAPI {
    /**
     * List高级API:获取默认容量
     */
    @Test
    public void testGetDefaultCapacity() throws Exception {
        Class<?> clazz = Class.forName("java.util.ArrayList");
        Field default_capacity = clazz.getDeclaredField("DEFAULT_CAPACITY");
        default_capacity.setAccessible(true);
        System.out.println("属性名:"+default_capacity.getName());
        System.out.println("属性值:"+default_capacity.get(clazz.newInstance()));
    }
    /**
     * List高级API:
     *      public void add(int index, E element){}:向指定位置添加
     */
    @Test
    public void testAddByIndex(){
        ArrayList<String> list = new ArrayList<>();
        list.add(0,"zhangsan");
        list.add(1,"lisi");
        list.add(2,"wangmazi");
        System.out.println(list);
    }

    /**
     * 测试list是否包含某一个元素
     *      包含:返回true
     *      不包含:返回false
     */
    @Test
    public void testContains(){
        ArrayList<String> list = new ArrayList<>();
        list.add(0,"zhangsan");
        list.add(1,"lisi");
        list.add(2,"wangmazi");
        System.out.println(list.contains("zhangsan"));
        System.out.println(list.contains("xxxxxxx"));
    }
}
