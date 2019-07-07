package com.dragonsoft.beanutils.test;

import com.dragonsoft.beanutils.entity.Person;
import com.dragonsoft.beanutils.entity.User;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.DateConverter;
import org.apache.commons.beanutils.converters.IntegerConverter;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ronin
 * @version V1.0
 * @description
 * @class BeanUtilsTest
 * @date 2019/6/20 14:27
 */
public class BeanUtilsTest {

    /**
     * 把Map数据封装到javaBean中
     * 注意:此方法多用于处理表单数据
     * BeanUtils.populate(user,request.getParameterMap())
     */
    @Test
    public void populate(){
        try {
            HashMap<String, String> beanMap = new HashMap<String, String>();
            beanMap.put("id","10002");
            beanMap.put("name","lisi");
            beanMap.put("age","32");
            beanMap.put("school","ufe");
            User user = new User();
            BeanUtils.populate(user,beanMap);
            System.out.println(user);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
    /**
     * 使用BeanUtils给属性设置值
     * static void BeanUtils.copyProperty(Object bean, String name, Object value);
     */
    @Test
    public void copyProperty(){
        try {
            //给User的age属性设置一个Integer类型的值,不涉及类型自动转换
            Integer ageValueInteger = 28;
            User user1 = new User();
            BeanUtils.copyProperty(user1,"age",ageValueInteger);
            System.out.println("不涉及类型自动转换:"+user1);

            //给User的age属性设置一个String类型的值,涉及类型自动转换
            String ageValueString = "49";
            User user2 = new User();
            BeanUtils.copyProperty(user2,"age",ageValueString);
            System.out.println("涉及类型自动转换:"+user2);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    /**
     * 使用BeanUtils复制对象中数据
     * static void copyProperties(Object dest, Object orig)
     */
    @Test
    public void copyPropertiesBeanToBean(){
        try {
            User source = new User("10001", "zhangsan", 18, "ufe");
            User target = new User();
            BeanUtils.copyProperties(target,source);
            System.out.println(target);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    /**
     * 使用BeanUtils把Map中数据封装到Bean中/或者说将Map装换为JavaBean对象
     * static void copyProperties(Object dest, Object orig)
     * 注意:
     *      age:String类型自动转换为Integer类型了
     *      school:key值应该是school,不是school1,key不对应,不会报错,但是值封装不进去
     */
    @Test
    public void copyPropertiesMapToBean(){
        try {
            HashMap<String, String> beanMap = new HashMap<String, String>();
            beanMap.put("id","10002");
            beanMap.put("name","lisi");
            beanMap.put("age","32");
            beanMap.put("school1","ufe");
            User user = new User();
            BeanUtils.copyProperties(user,beanMap);
            System.out.println(user);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    /**
     * 把Map中数据封装到Bean中，并进行时间格式转换
     */
    @Test
    public void copyPropertiesWithDateFormate(){
        try {
            Map<String, Object> beanMap = new HashMap<String, Object>();
            beanMap.put("id", "10003");
            beanMap.put("userName", "刘诗华");
            beanMap.put("password", "123456");
            beanMap.put("hireDate", "2018/11/19");

            //目标数据
            Person person = new Person();

            //时间数据格式对象
            DateConverter converter=new DateConverter();

            //converter.setPattern("yyyy-MM-dd HH:mm:ss"); //单个数据格式
            //一组时间格式
            String[] pattern=new String[3];
            pattern[0]="yyyy-MM-dd HH:mm:ss";
            pattern[1]="yyyy-MM-dd";
            pattern[2]="yyyy/MM/dd";
            converter.setPatterns(pattern);

            //如果Id上面没有数据,则设置为null
            IntegerConverter integerConverter=new IntegerConverter(10003);
            ConvertUtils.register(integerConverter, Integer.class);

            //注册Date时间对象格式
            ConvertUtils.register(converter, Date.class);
            //开始复制数据信息
            BeanUtils.copyProperties(person, beanMap);
            System.out.println(person);
            //User(id=null, userName=刘诗华, password=123456, hireDate=Mon Nov 19 00:00:00 CST 2018)
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    /**
     * 使用BeanUtils给属性设置值
     *      setProperty：给属性设置值 static void setProperty(Object bean, String name, Object value)
     */
    @Test
    public void setProperty(){
        try {
            //给User的age属性设置一个String类型的值,涉及类型自动转换
            String ageValueString = "49";
            User user = new User();
            BeanUtils.setProperty(user,"age",ageValueString);
            System.out.println("涉及类型自动转换:"+user);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    /**
     * 使用BeanUtils给属性设置值
     *      getProperty：给属性设置值 static String getProperty(Object bean, String name)
     */
    @Test
    public void getProperty(){
        try {
            User user = new User("10001", "zhangsan", 18, "ufe");
            String age = BeanUtils.getProperty(user, "age");
            System.out.println(age);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }


    /**
     * 使用BeanUtils克隆JavaBean
     *      Object cloneBean(Object bean)
     */
    @Test
    public void cloneBean(){
        try {
            User user = new User("10001", "zhangsan", 18, "ufe");
            User userClone = (User)BeanUtils.cloneBean(user);
            System.out.println("user:"+user);
            System.out.println("userClone:"+userClone);
            System.out.println(user  == userClone);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }


}
