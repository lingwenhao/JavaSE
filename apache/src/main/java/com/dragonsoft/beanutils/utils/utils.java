package com.dragonsoft.beanutils.utils;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.Array;
import java.util.Map;

/**
 * @author ronin
 * @version V1.0
 * @description
 * @class utils
 * @date 2019/6/20 15:14
 */
public class utils {

    /**
     * 将表单数据封装到JavaBean中
     * @param map
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> T toBean(Map map, Class<T> clazz) {
        try {
			/*
			 *1.创建指定类型的javabean对象
			 */
            T bean = clazz.newInstance();
			/*
			 * 2.把数据封装到javabean中
			 */
            BeanUtils.populate(bean, map);
			/*
			 * 3.返回javabean对象
			 */
            return bean;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /***
     * 复制数组
     * @param src 源数组
     * @param srcPos 源数组要复制的起始位置
     * @param dest 目的数组
     * @param destPos 目的数组放置的起始位置
     * @param length 从原数组复制的长度
     * @return void
     * @throws
     */
    //public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length);

    /**
     * 数组扩容方法，此处不使用泛型也可以，则返回值为Object类型数据(调用方法时要进行类型转换)，而非T类型数组
     * @param src 原数组
     * @param size 新数组的长度
     * @return T
     * @throws
     */
    public static <T> T growArray(T src,int size){
        /**
         * 判断第一个参数是不是 一个数组，是数组:继续往下执行，不是数组抛出异常
         */
        if(! src.getClass().isArray()){
            throw new IllegalArgumentException("请传入数组格式的参数!");
        }
        @SuppressWarnings("unchecked")
        T dest = (T) Array.newInstance(src.getClass().getComponentType(), size);
        System.arraycopy(src, 0, dest, 0, Math.min(Array.getLength(src), size));
        return dest;
    }
}
