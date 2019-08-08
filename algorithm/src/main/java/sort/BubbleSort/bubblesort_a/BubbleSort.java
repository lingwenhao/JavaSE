package sort.BubbleSort.bubblesort_a;


import java.util.Arrays;

/**
 * 冒泡排序
 * @author ronin
 * @version V1.0
 * @since 2019/8/8 9:04
 */
public class BubbleSort {

    private static int[] arr ;

    /**
     * 冒泡排序
     * @param nums
     */
    public static void bubbleSort(int[] nums){
        System.out.println("-------------------------------------");
        int length = nums.length;
        System.out.println("原数组:"+Arrays.toString(nums));
        System.out.println("原数组长度:"+nums.length);
        //外层循环控制比较轮数
        for(int i=0; i < length - 1; i++){
            //内层循环比较每一轮比较次数
            for(int j=0; j < length-1-i; j++){
                if(nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
            System.out.println("第"+(i+1)+"次排序的结果:" + Arrays.toString(nums));
        }
        arr = nums;
        System.out.println("-------------------------------------");
    }

    /**
     * 打印当前数组
     */
    public static void show(){
        System.out.println(Arrays.toString(arr));
    }
}
