package sort.ShellSort.shellsort_a;

import java.util.Arrays;

/**
 * @author ronin
 */
public class ShellSort {
    public static void main(String[] args) {
        //shellSort1();
        System.out.println("------------------------------");
        //shellSort2();
        System.out.println("------------------------------");
        shellSort3();
    }

    /**
     * 一步完成希尔排序:移位法
     */
    private static void shellSort3() {
        int[] arr = {8,9,1,7,2,3,5,4,6,0};
        int count = 0;
        System.out.println("原数组:"+ Arrays.toString(arr));
        for(int gap = arr.length/2; gap>0; gap/=2){
            for(int i=gap; i<arr.length; i++){
                for(int j=i-gap; j>=0; j-=gap){
                    int inserValue = arr[j+gap];
                    int insertIndex = j;
                    while(insertIndex >=0 && arr[insertIndex] > inserValue){
                        arr[insertIndex+gap] = arr[insertIndex];
                        insertIndex = insertIndex - gap;
                    }
                    arr[insertIndex+gap] = inserValue;
                }
            }
            System.out.println("第"+(++count)+"轮:"+ Arrays.toString(arr));
        }
        System.out.println("原数组:"+ Arrays.toString(arr));
    }

    /**
     * 一步完成希尔排序:交换法
     */
    private static void shellSort2() {
        int[] arr = {8,9,1,7,2,3,5,4,6,0};
        int count = 0;
        System.out.println("原数组:"+ Arrays.toString(arr));
        for(int gap = arr.length/2; gap>0; gap/=2){
            for(int i=gap; i<arr.length; i++){
                for(int j=i-gap; j>=0; j-=gap){
                    if(arr[j] > arr[j+gap]){
                        int temp = arr[j];
                        arr[j] = arr[j+gap];
                        arr[j+gap] = temp;
                    }
                }
            }
            System.out.println("第"+(++count)+"轮:"+ Arrays.toString(arr));
        }
        System.out.println("原数组:"+ Arrays.toString(arr));
    }

    /**
     * 逐步完成希尔排序
     */
    private static void shellSort1() {
        int[] arr = {8,9,1,7,2,3,5,4,6,0};
        System.out.println("原数组:"+ Arrays.toString(arr));
        //第一轮
        //将十个数据分成10/2=5组
        for(int i=5; i<arr.length; i++){
            //步长是5
            for(int j=i-5; j>=0; j-=5){
                if(arr[j] > arr[j+5]){
                    int temp = arr[j];
                    arr[j] = arr[j+5];
                    arr[j+5] = temp;
                }
            }
        }
        System.out.println("第一轮:"+ Arrays.toString(arr));

        //第二轮
        //将十个数据分成5/2=2组
        for(int i=2; i<arr.length; i++){
            //步长是2
            for(int j=i-2; j>=0; j-=2){
                if(arr[j] > arr[j+2]){
                    int temp = arr[j];
                    arr[j] = arr[j+2];
                    arr[j+2] = temp;
                }
            }
        }
        System.out.println("第二轮:"+ Arrays.toString(arr));

        //第三轮
        //将十个数据分成2/2=1组
        for(int i=1; i<arr.length; i++){
            //步长是1
            for(int j=i-1; j>=0; j-=1){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("第三轮:"+ Arrays.toString(arr));
    }
}
