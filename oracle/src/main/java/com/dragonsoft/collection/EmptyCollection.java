package com.dragonsoft.collection;


import org.junit.Test;

import java.util.*;

/**
 * @author ronin
 * @version V1.0
 * @desc 避免抛出空指针异常的
 * @since 2019/7/9 15:29
 */
public class EmptyCollection {
    /**
     * 测试获取空的List集合
     */
    @Test
    public void testEmptyList(){
        List<Customer> customerList = this.getCustomerList();
        System.out.println(customerList.size());
    }
    /**
     * 测试获取空的Set集合
     */
    @Test
    public void testEmptySet(){
        Set<Customer> customerSet = this.getCustomerSet();
        System.out.println(customerSet.size());
    }
    /**
     * 测试获取空的List集合
     */
    @Test
    public void testEmptyMap(){
        Map<String,Customer> customerMap = this.getCustomerMap();
        System.out.println(customerMap.size());
    }

    /**
     * 返回一个空的List
     *      省略了调用层判断集合对象是否为空的操作
     * @return
     */
    public List<Customer> getCustomerList(){
        /**
         * emptyList()不过是对EMPTY_LIST做了一个泛型支持。这点上我们就可以很清晰的了解两者不同的使用场景了！
         * 若是不需要泛型的情况，可以直接使用Collections,反之则使用emptyList().
         */
        List result = Collections.EMPTY_LIST;
        //List<Customer> result = Collections.emptyList();
        return result;
    }
    /**
     * 返回一个空的Set
     *      省略了调用层判断集合对象是否为空的操作
     * @return
     */
    public Set<Customer> getCustomerSet(){
        /**
         * emptySet()不过是对EMPTY_SET做了一个泛型支持。这点上我们就可以很清晰的了解两者不同的使用场景了！
         * 若是不需要泛型的情况，可以直接使用Collections,反之则使用emptySet().
         */
        Set result = Collections.EMPTY_SET;
        //Set<Customer> result = Collections.emptySet();
        return result;
    }
    /**
     * 返回一个空的Map
     *      省略了调用层判断集合对象是否为空的操作
     * @return
     */
    public Map<String,Customer> getCustomerMap(){
        /**
         * emptyMap()不过是对EMPTY_MAP做了一个泛型支持。这点上我们就可以很清晰的了解两者不同的使用场景了！
         * 若是不需要泛型的情况，可以直接使用Collections,反之则使用emptyMap().
         */
        Map result = Collections.EMPTY_MAP;
        //Map<Object, Customer> objectObjectMap = Collections.emptyMap();
        return result;
    }

    /**
     * 内部类
     */
    private class Customer{

    }
}
