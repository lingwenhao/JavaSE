package com.dragonsoft.sort;

import java.util.Arrays;

import org.junit.Test;

/**  
* @author ronin
* @date 2019年3月2日  
*    
*/
public class ChoiceSort {
	@Test
	public void fun(){
		 int[] num = {4,8,6,3,1,9,2,5};
	        System.out.println("--------------------------------------------");
	        System.out.println("未排序前的数组   :"+Arrays.toString(num));
	        //外层循环控制比较的轮数
	        for(int i=0;i<num.length-1;i++){
	            //min = i;意味着:min最开始的值是0
	            int min = i;
	            //为什么j要从i+1开始呢?因为i初始值为0,j的初始值就为1,num[j]即是num[1],num[min]即是num[0]
	                //内层循环控制每一轮比较的次数
	            for(int j=i+1;j<num.length;j++){
	                if(num[j] < num[min]){
	                    min = j;
	                }
	            }
	            if(i != min){
	                num[i] = num[i] ^ num[min];
	                num[min] = num[i] ^ num[min];
	                num[i] = num[i] ^ num[min];
	            }
	            System.out.println("第"+(i+1)+"次排序后的数组:"+Arrays.toString(num));
	        }
	        System.out.println("--------------------------------------------");
	        System.out.println("选择排序完后的数组:"+Arrays.toString(num));
	}
}
