package sort.SelectSort.selectsort_a;

import java.util.Arrays;

/**
 * @author ronin
 */
public class SelectSort {
    public static void main(String[] args) {
        selectSort1();
        System.out.println("------------------------");
        selectSort2();
    }

    /**
     * 选择排序
     */
    private static void selectSort2() {
        int[] arr = {1,12,84,52,3,9};
        System.out.println("原数组:"+ Arrays.toString(arr));
        //第一轮排序
        for(int i=0; i<arr.length-1; i++){
            int minIndex = i;
            int min = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if(min > arr[j]){
                    //重置最小索引
                    minIndex = j;
                    //重置最小值
                    min = arr[j];
                }
            }
            System.out.println("最小索引的值:"+minIndex);
            if(minIndex != i) {
                System.out.println("~进行了交换~");
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
            System.out.println("第"+(i+1)+"轮:"+Arrays.toString(arr));
        }
        System.out.println("最终结果:"+Arrays.toString(arr));
    }

    /**
     * 分步骤选择排序
     */
    private static void selectSort1() {
        int[] arr = {1,12,84,52,3,9};
        System.out.println("原数组:"+ Arrays.toString(arr));
        //第一轮排序
        int minIndex = 0;
        int min = arr[0];
        for (int i = 0+1; i < arr.length; i++) {
            if(min > arr[i]){
                //重置最小索引
                minIndex = i;
                //重置最小值
                min = arr[i];
            }
        }
        System.out.println("最小索引的值:"+minIndex);
        if(minIndex !=0) {
            arr[minIndex] = arr[0];
            arr[0] = min;
        }
        System.out.println("第一轮:"+Arrays.toString(arr));

        //第二轮排序
        minIndex = 1;
        min = arr[1];
        for (int i = 1+1; i < arr.length; i++) {
            if(min > arr[i]){
                //重置最小索引
                minIndex = i;
                //重置最小值
                min = arr[i];
            }
        }
        System.out.println("最小索引的值:"+minIndex);
        if(minIndex != 1) {
            arr[minIndex] = arr[1];
            arr[1] = min;
        }
        System.out.println("第二轮:"+Arrays.toString(arr));

        //第三轮排序
        minIndex = 2;
        min = arr[2];
        for (int i = 2+1; i < arr.length; i++) {
            if(min > arr[i]){
                //重置最小索引
                minIndex = i;
                //重置最小值
                min = arr[i];
            }
        }
        System.out.println("最小索引的值:"+minIndex);
        if(minIndex !=2) {
            arr[minIndex] = arr[2];
            arr[2] = min;
        }
        System.out.println("第三轮:"+Arrays.toString(arr));

        //第五轮排序
        minIndex = 3;
        min = arr[3];
        for (int i = 3+1; i < arr.length; i++) {
            if(min > arr[i]){
                //重置最小索引
                minIndex = i;
                //重置最小值
                min = arr[i];
            }
        }
        System.out.println("最小索引的值:"+minIndex);
        if(minIndex != 3) {
            arr[minIndex] = arr[3];
            arr[3] = min;
        }
        System.out.println("第三轮:"+Arrays.toString(arr));
    }
}
