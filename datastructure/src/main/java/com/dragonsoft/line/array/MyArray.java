/**  
* @Title: MyArray.java  
* @Package com.dragonsoft.array  
* @Description: TODO(用一句话描述该文件做什么)  
* @author ronin  
* @date 2019年3月2日  
* @version V1.0  
*/ 
package com.dragonsoft.line.array;

import java.util.Arrays;

/**  
* @ClassName: MyArray  
* @Description: TODO(数组中的是数据结构)  
* @author ronin  
* @date 2019年3月2日  
*    
*/
public class MyArray {
	/**
     * 创建用于存储数组的数组
     */
    private int[] elements;

    /**
     * 初始化该数组
     */
    public MyArray(){
        elements = new int[0];
    }

    /**
     * 返回数组的长度
     */
    public int size(){
        return elements.length;
    }

    /**往数组的末尾添加一个元素
     *
     */
    public void add(int value){
        //1.创建一个新的数组,该数组的长度是原来数组的长度+1
        int[] newArr = new int[elements.length+1];
        //2.把原来数组中的值赋给新创建的数组
        for(int i=0;i<elements.length;i++){
            newArr[i] = elements[i];
        }
        newArr[newArr.length-1] = value;
        //3.替换数组(返回改数组)
        elements = newArr;
    }

    /**
     * 删除数组中的元素
     */
    public void delete(int index){
        //判断数组下标是否越界
        if(index < 0 || index > elements.length-1){
            throw new RuntimeException("删除数组元素时发生下标越界!");
        }else{
            //1.创建一个新的数组,长度是原来数组的长度-1
            int[] newArr = new int[elements.length-1];
            //2.把原数组中的值赋值给新数组
            for(int i=0;i<newArr.length;i++){
                if(i < index){
                    newArr[i] = elements[i];
                }else{
                    newArr[i] = elements[i+1];
                }
            }
            //3.替换数组
            elements = newArr;
        }
    }

    /**
     * 获取某个元素
     */
    public int get(int index){
        if(index<0 || index >elements.length-1){
            throw new RuntimeException("获取数组元素时发生下标越界!");
        }
        return elements[index];
    }

    /**
     * 把元素插入到数组中指定位置
     */
    public void  insert(int index,int value){
        if(index<0 || index>elements.length-1){
            throw new RuntimeException("把元素插入到数组中时发生下标越界!");
        }else {
            //1.创建新的数组
            int[] newArr = new int[elements.length+1];
            //2.把原数组的值赋值到新数组中
            for(int i=0;i<newArr.length;i++){
                if(i<index){
                    newArr[i] = elements[i];
                }else{
                    newArr[i] = elements[i-1];
                }
            }
            //3.插入元素
            newArr[index] = value;
            //4.替换数组
            elements = newArr;
        }
    }

    /**
     * 替换指定位置的元素
     */
    public void set(int index,int value){
        if(index<0 || index>elements.length-1){
            throw new RuntimeException("替换指定位置的元素时发生下标越界!");
        }else {
            for(int i=0;i<elements.length;i++){
                if(i == index){
                    elements[i] = value;
                    return;
                }
            }
        }
    }
    /**
     * 打印该数组
     */
    public void show(String operator){
        if(operator.length() == 0 || operator == null){
            System.out.println("原始数组:"+Arrays.toString(elements));
        }else {
            System.out.println(operator + "操作后进行打印:" + Arrays.toString(elements));
        }
    }
}
