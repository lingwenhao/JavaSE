package com.dragonsoft.collection;


import java.util.*;

/**
 * SpringMVC中模型中有一个模型是ModelAndView,这个类中有一个属性是ModelMap类型的数据，ModelMap
 *      继承了LinkedHashMap<String, Object>:
 *      public class ModelMap extends LinkedHashMap<String, Object> {}
 * LinkedHashMap可以认为是HashMap+LinkedList，即它既使用HashMap操作数据结构，又使用LinkedList维护插入元素的先后顺序:
 *      当key/value为数字类型或String类型的数字时，遍历时Map时会自动排序
 *      当key/value为不是数字类型或不是String类型的数字时，遍历时LinkedHashMap时会自动排序，Map不会自动排序
 */
public class LinkHashMapTest {
    private static Map<String, String> linkedHashMap = new LinkedHashMap<String, String>();
    private static Map<String, String> map  = new HashMap<String, String>();
    static {
        /**
         * LinkedHashMap
         */
        linkedHashMap.put("大","大");
        linkedHashMap.put("2","2");
        linkedHashMap.put("3","3");
        linkedHashMap.put("4","4");
        linkedHashMap.put("5","5");
        linkedHashMap.put("小","小");
        linkedHashMap.put("7","7");
        linkedHashMap.put("8","8");
        linkedHashMap.put("9","9");

        /**
         * HashMap
         */
        map.put("大","大");
        map.put("2","2");
        map.put("3","3");
        map.put("4","4");
        map.put("小","小");
        map.put("6","6");
        map.put("7","7");
        map.put("8","8");
        map.put("9","9");
    }

    public static void main(String[] args) {
        /**
         * 打印Map
         */
        printMap(linkedHashMap);
        printMap(map);

        /**
         * 测试Map集合的valuesAPI
         */
        valuesAPI(map);
    }

    /**
     * 打印Map
     * @param map
     */
    public  static void printMap(Map<String,String> map){
        System.out.println("-----------------打印"+map.getClass().getSimpleName()+"开始-----------------------");
        Set<String> keys = map.keySet();
        Iterator<String> iterator = keys.iterator();
        while(iterator.hasNext()){
            String key = iterator.next();
            String value = map.get(key);
            System.out.println(key+"----"+value);
        }

        /**
         * map的另一种遍历方式
         */
//        for (Iterator iterator = map.values().iterator(); iterator.hasNext();)     {
//            String name = (String) iterator.next();
//            System.out.println(name);
//        }
        System.out.println("-----------------打印"+map.getClass().getSimpleName()+"结束-----------------------");
    }

    /**
     * Map集合的values API:获取Map中所有的值，不包括键
     * @param map
     */
    public static void valuesAPI(Map<String, String> map){
        System.out.println("-----------------测试"+map.getClass().getSimpleName()+"结values()方法开始-----------------------");
        System.out.println(map);
        System.out.println(map.values());
        System.out.println("-----------------测试"+map.getClass().getSimpleName()+"结values()方法结束-----------------------");
    }

}
