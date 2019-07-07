/**  
* @Title: BubbleSort.java  
* @Package com.dragonsoft.sort  
* @Description: TODO(用一句话描述该文件做什么)  
* @author ronin  
* @date 2019年3月2日  
* @version V1.0  
*/ 
package com.dragonsoft.sort;

import org.junit.Test;

import java.util.Arrays;


/**  
* @ClassName: BubbleSort  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author ronin  
* @date 2019年3月2日  
*    
*/
public class BubbleSort {
	@Test
	public void fun(){
		/**
         * 两种方式交换a、b的值
         */
        int a = 10;
        int b = 100;
        //通过中间变量交换两个变量的值
        System.out.println("交换前a:"+a+",交换前b:"+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("交换后a:"+a+",交换后b:"+b);
        //通过异或运算交换两个变量的值
        int c = 10;
        int d = 20;
        System.out.println("交换前c:"+c+",交换前d:"+d);
        c = c ^ d;
            //c = c ^ d;
        d = c ^ d;
            //d = c ^ d ^ d = c ^ (d ^ d) = c ^ 0 = c
        c = c ^ d;
            //c = c ^ d = c ^ d ^ c = c ^ c ^ d = d
        System.out.println("交换前c:"+c+",交换前d:"+d);
        //异或运算法则
        System.out.println("a^a的结果是0:"+(1^1));
        System.out.println("a^0的结果是a:"+(100^0));

        /**
         * 冒泡排序
         */
        int[] num = {1,8,42,36,25,18,0};
        System.out.println("-------------------------------");
        System.out.println("未进行排序的数组 :"+Arrays.toString(num));
        for(int i=1;i<num.length;i++){
            for(int j=0;j<num.length-i;j++){
                if(num[j]>num[j+1]){
                    num[j] = num[j] ^ num[j+1];
                    num[j+1] = num[j] ^ num[j+1];
                    num[j] = num[j] ^ num[j+1];
                }
            }
            System.out.println("第"+i+"次排序后的数组:"+Arrays.toString(num));
        }
        System.out.println("排序完成后的数组 :"+Arrays.toString(num));
        System.out.println("-------------------------------");
	}
}
