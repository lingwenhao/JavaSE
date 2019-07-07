/**  
* @Title: TestMyarray.java  
* @Package com.dragonsoft.array  
* @Description: TODO(用一句话描述该文件做什么)  
* @author ronin  
* @date 2019年3月2日  
* @version V1.0  
*/ 
package com.dragonsoft.line.array;

import org.junit.Test;

/**  
* @ClassName: TestMyarray  
* @Description: TODO(测试MyArray)  
* @author ronin  
* @date 2019年3月2日  
*    
*/
public class TestMyarray {
	@Test
	public void fun(){
        MyArray myArray = new MyArray();
        /**
         * 打印原始数组
         */
        myArray.show("");
        /**
         * 给数组增加数据
         */
        myArray.add(88);
        myArray.add(90);
        myArray.add(92);
        myArray.add(93);
        /**
         * 打印新增后的数组
         */
        myArray.show("新增");
        /**
         * 删除数组中数据
         */
        myArray.delete(1);
        /**
         * 打印数组
         */
        myArray.show("删除");

        /**
         * 获取指定位置的元素
         */
        System.out.println(myArray.get(0));

        /**
         * 打印当前数组
         */
        myArray.show("");
        /**
         * 插入元素到指定位置
         */
        myArray.insert(1,48);
        myArray.show("插入");
        /**
         * 打印当前数组
         */
        myArray.show("");
        /**
         * 替换指定位置的元素
         */
        myArray.set(1,8888);
        /**
         * 打印当前数组
         */
        myArray.show("替换指定位置元素");
	}

}
