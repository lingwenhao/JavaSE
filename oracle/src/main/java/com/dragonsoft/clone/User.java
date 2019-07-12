package com.dragonsoft.clone;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ronin
 * @version V1.0
 * @desc 测试深克隆的用例:
 *       深克隆方式：
 *          1:对实体中的某些字段进行特殊处理，如:复制数组、复制集合
 *          2.理或者使该实体中的引用也实现Cloneable接口，并重写Objet中clone()方法
 *       这种深克隆方式的局限性:
 * @since 2019/7/11 11:13
 */

/**
 *  浅克隆修改副本数据和对原型数据的影响:
 *      修改基本类型数据:浅克隆时修改克隆出来的副本不影响原型中数据
 *      修改String类型数据:浅克隆时修改克隆出来的副本不影响原型中数据
 *      修改包装类型数据:浅克隆时修改克隆出来的副本不影响原型中数据
 *      修改数组类型数据:浅克隆时修改克隆出来的副本会影响原型中数据
 *      修改List类型数据:浅克隆时修改克隆出来的副本会影响原型中数据
 *      修改引用类型的数据:浅克隆时修改克隆出来的副本会影响原型中数据
 *  防止修改副本时影响原型:
 *      引用类型的数据:如User中有一个数据类型为Mark类型的引用，要想实现深克隆，则这个类需要实现序列化接口，重写Object中clone()方法
 *      集合类型/数组类型数据:克隆出副本后返回前，先拿到类型的数据，然后创建一个新的该类型的对象
 */
public class User implements Cloneable {
    /**
     * 测试深克隆
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        /**
         * 匿名内部类方式初始化ArrayList
         */
        ArrayList<String> friends = new ArrayList<String>(){{
            add("小红");
            add("小明");
        }};
        System.out.println(friends);
        User user = new User(1, "zhagnsan", 18, new String[]{"羽毛球"},
                friends, new Mark(86.9, 83.3));
        System.out.println("原型对象:"+user);
        User userClone = user.clone();
        System.out.println("克隆对象:"+userClone);
        System.out.println("---------------------------------------");
            //修改基本类型数据:浅克隆时修改克隆出来的副本不影响原型中数据
        userClone.setId(11);
            //修改String类型数据:浅克隆时修改克隆出来的副本不影响原型中数据
        userClone.setName("zhangsan1");
            //修改包装类型数据:浅克隆时修改克隆出来的副本不影响原型中数据
        userClone.setAge(181);
            //修改数组类型数据:浅克隆时修改克隆出来的副本会影响原型中数据
        String[] hobby = userClone.getHobby();
        hobby[0] = "羽毛球1";
            //修改List类型数据:浅克隆时修改克隆出来的副本会影响原型中数据
        List<String> friends1 = userClone.getFriends();
        friends1.set(0,"嘻嘻");
        friends1.set(1,"哈哈");
        userClone.setFriends(friends1);
            //修改引用类型的数据:浅克隆时修改克隆出来的副本会影响原型中数据
        userClone.setMark(new Mark(1.0,2.0));
        System.out.println("原型对象:"+user);
        System.out.println("修改后的克隆对象:"+userClone);
    }

    /**
     * 基本类型
     */
    private int id;
    /**
     * String类型
     */
    private String name;
    /**
     * 包装类型
     */
    private Integer age;
    /**
     * 引用类型
     */
    private String[] hobby;
    /**
     * 集合类型
     */
    private List<String> friends;
    /**
     * 引用类型
     */
    private Mark mark;

    @Override
    protected User clone() throws CloneNotSupportedException {
        User user = (User) super.clone();
        //处理数组类型数据
            //获取副本中hobby的引用，此引用和原型中hobby指向堆中同一块区域
        String[] hobby = user.getHobby();
            //把原型中的引用指向堆中的数据复制一份
        String[] hobbyCopy = Arrays.copyOf(hobby, hobby.length);
            //把副本中对应的引用指向这个复制的数据，这样修改副本中的引用指向的数据就不会影响到原型中的数据了
        user.setHobby(hobbyCopy);

        //处理集合类型的数据
            //获取副本中List的引用，此引用和原型中hobby指向堆中同一块区域
        List<String> friends = user.getFriends();
            //把原型中的引用指向堆中的数据复制一份
        ArrayList<String> friendsCopy = new ArrayList<>(friends);
        //把副本中对应的引用指向这个复制的数据，这样修改副本中的引用指向的数据就不会影响到原型中的数据了
        user.setFriends(friendsCopy);
        return user;
    }

    public User() {
    }

    public User(int id, String name, Integer age, String[] hobby, List<String> friends, Mark mark) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.hobby = hobby;
        this.friends = friends;
        this.mark = mark;
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

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public Mark getMark() {
        return mark;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", hobby=" + Arrays.toString(hobby) +
                ", friends=" + friends +
                ", mark=" + mark +
                '}';
    }
}

/**
 * @author ronin
 * @version V1.0
 * @desc 测试深克隆的用例:
 * @since 2019/7/11 11:13
 */
class Mark implements Cloneable {
    private double chinese;
    private double math;

    @Override
    protected Mark clone() throws CloneNotSupportedException {
        return (Mark)super.clone();
    }

    public Mark() {
    }

    public Mark(double chinese, double math) {
        this.chinese = chinese;
        this.math = math;
    }

    public double getChinese() {
        return chinese;
    }

    public void setChinese(double chinese) {
        this.chinese = chinese;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    @Override
    public String toString() {
        return "Mark{" +
                "chinese=" + chinese +
                ", math=" + math +
                '}';
    }
}
