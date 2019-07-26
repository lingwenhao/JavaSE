package com.dragonsoft.lang3;

import org.apache.commons.lang3.SerializationUtils;

import java.io.Serializable;

/**
 * @author ronin
 * @version V1.0
 * @desc
 * @since 2019/7/26 16:31
 */
public class SerializationUtilsTest {

    public static void main(String[] args) {
        Person zhangsan = new Person("zhangsan", "28");
        byte[] serialize = SerializationUtils.serialize(zhangsan);
        System.out.println(serialize);
        Person deserialize = SerializationUtils.deserialize(serialize);
        System.out.println(deserialize);
    }

    private static class Person implements Serializable{
        private static final long serialVersionUID = 1L;

        private String name;
        private String age;

        public Person(String name, String age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age='" + age + '\'' +
                    '}';
        }
    }
}
