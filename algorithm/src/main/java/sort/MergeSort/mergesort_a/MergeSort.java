package sort.MergeSort.mergesort_a;

import java.util.Arrays;

/**
 * @author ronin
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8,4,5,7,3,6,2,1};
        int[] temp = new int[arr.length];
        parse(arr,0,arr.length-1,temp);

        System.out.println(Arrays.toString(arr));

    }

    public static void parse(int[] arr,int left,int right,int[] temp){
        if(left<right){
            int mid = (left + right)/2;
            //向左递归分解
            parse(arr,left,mid,temp);
            //向右递归分解
            parse(arr,mid+1,right,temp);
            //每分解一次就合并一次
            merge(arr,left,mid,right,temp);
        }
    }

    /**
     * 治
     * @param arr 原数组
     * @param left 左边有序序列的初始索引
     * @param mid 中间索引
     * @param right 右边有序序列的初始索引
     * @param temp temp数组
     */
    public static void merge(int[] arr,int left,int mid,int right,int[] temp){
        //左边有序序列的初始索引
        int i = left;
        //右边有序序列的初始索引
        int j = mid+1;
        //temp数组的索引，指向temp数组的当前索引(变化的)
        int t = 0;
        //1.先把左右两边的数据按规则填充到temp数组，直到左右两边的有序数组有一边全部处理完毕为止
        while(i<=mid && j<=right){
            //左边数组的当前元素小于等于右边数组的当前元素
            if(arr[i] <= arr[j]){
                temp[t] = arr[i];
                t++;
                i++;
            }else {
                temp[t] = arr[j];
                t++;
                j++;
            }
        }
        //2.上一步过后，把把某一边数组中的剩余元素依次全部填充到temp
        while(i<=mid){
            temp[t] = arr[i];
            t++;
            i++;
        }
        while(j<=right){
            temp[t] = arr[j];
            t++;
            j++;
        }
        System.out.println(Arrays.toString(temp));
        //3.将temp数组的数组拷贝到原数组
//        t = 0;
//        int tempLeft = left;
//        while(tempLeft<=right){
//            temp[tempLeft] = temp[t];
//            t++;
//            tempLeft++;
//        }
    }
}
