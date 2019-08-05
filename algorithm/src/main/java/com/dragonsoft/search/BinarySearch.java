package com.dragonsoft.search;


import org.junit.Test;

/**
* @author ronin
* @date 2019年3月2日  
*/
public class BinarySearch {
	@Test
	public void fun(){
		/**
         * 二分查找法,要求数组中数据是有序的
         */
        //目标数组
        int[] num = {1,2,3,4,5,6,7,8,9};
        //目标元素
        int target = 5;
        //记录开始位置
        int begin = 0;
        //记录结束位置
        int end = num.length-1;
        //记录中间位置
        int mid = (begin+end)/2;
        //记录目标位置
        int index = -1;
        while(true){
            if(num[mid] == target){
                index = mid;
                break;
            //中间元素不是目标元素
            }else{
                //中间元素比目标元素大
                if(num[mid]>target){
                    //把结束位置调整到中间位置前一个位置
                    end = mid - 1;
                //中间元素比目标元素小
                }else{
                    begin = mid+1;
                }
            }
            //取出新的中间位置
            mid = (begin+end)/2;
        }
        System.out.println("index:"+index);
	}

}
