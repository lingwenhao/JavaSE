package com.dragonsoft.clone;

/**
 * @author ronin
 * @version V1.0
 * @desc
 * @since 2019/7/10 11:42
 */
public class TestSheep {
    public static void main(String[] args) throws CloneNotSupportedException {
        //https://www.cnblogs.com/ytjava/p/7677884.html
        //https://www.cnblogs.com/wuyudong/p/4399180.html
        //原型羊多利
        Sheep sheep = new Sheep();
        sheep.setAge(8);
        sheep.setName("多利");
        System.out.println("克隆前:"+sheep);
        //克隆羊多利
        Sheep cloneSheep = sheep.clone();
        System.out.println(sheep == cloneSheep);
        //ShadowClone c1 = new ShadowClone();
        //对c1赋值
        //c1.setA(100) ;
        //c1.setB(new int[]{1000}) ;

        //System.out.println("克隆前c1:  a="+c1.getA()+" b="+c1.getB()[0]);
        //克隆出对象c2,并对c2的属性A,B,C进行修改
        //ShadowClone c2 = (ShadowClone) c1.clone();
        //对c2进行修改
//        c2.setA(50) ;
//        int []a = c2.getB() ;
//        a[0]=5 ;
//        c2.setB(a);
//        System.out.println("克隆前c1:  a="+c1.getA()+" b="+c1.getB()[0]);
//        System.out.println("克隆后c2:  a="+c2.getA()+ " b[0]="+c2.getB()[0]);
    }
}
