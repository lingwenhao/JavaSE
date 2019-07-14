package com.dragonsoft.clone;


import java.io.*;

/**
 * @author ronin
 * @version V1.0
 * @desc 使用序列化实现深克隆
 * @since 2019/7/12 16:21
 */
public class Student implements Serializable{
    /**
     * 测试使用序列化机制实现深克隆
     */
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Teacher teacher = new Teacher(1,42,"张老师");
        Student student = new Student(1, "小明", 15, teacher);
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream oo = new ObjectOutputStream(bo);
        //序列化
        oo.writeObject(student);
        //关闭流
        oo.close();
        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream oi = new ObjectInputStream(bi);
        //反序列化
        Student studentCloneSerializable = (Student) oi.readObject();
        //关闭流
        oi.close();
        //原型对象:
        System.out.println("原Student："+student);
        //修改克隆对象中引用类型数据的属性值:
        Teacher teacher1 = new Teacher(1,42,"张老师11111");
        studentCloneSerializable.setTeacher(teacher1);
        //克隆对象:
        System.out.println("克隆的Student："+studentCloneSerializable);
        System.out.println("修改克隆出来的副本后再打印Student："+student);
    }

    private int id;
    private String name;
    private Integer age;
    private Teacher teacher;


    public Student() {
    }

    public Student(int id, String name, Integer age, Teacher teacher) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.teacher = teacher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", teacher=" + teacher +
                '}';
    }
}

class Teacher implements Serializable{
    private int id;
    private Integer age;
    private String name;

    public Teacher() {
    }

    public Teacher(int id, Integer age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}