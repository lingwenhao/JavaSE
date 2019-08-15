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

    private static void parse(int[] arr,int left,int right,int[] temp){
        if(left<right){
            int mid = (left + right)/2;
            //向左递归分解
            parse(arr,left,mid,temp);
            //向右递归分解
            parse(arr,mid+1,right,temp);
            //每分解一次就合并一次
            System.out.println("left:"+left);
            System.out.println("mid:"+mid);
            System.out.println("right:"+right);
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
    private static void merge(int []arr,int left,int mid,int right,int[] temp){
        //l、r是检测指针
        int l = left;
        int r = mid+1;
        //t是temp数组的指针
        System.out.println("left:"+left);
        int t = left;

        //if判断法
        while(l<=mid && r<=right){
            if(arr[l]<=arr[r]) {
                temp[t++] = arr[l++];
            }else {
                temp[t++] = arr[r++];
            }
        }

        //三目运算
//        while(l<=mid && r<=right){
//            temp[t++] = arr[l]<=arr[r] ? arr[l++] : arr[r++];
//        }

        //如果第一个序列未检测完，直接将后面所有元素加到合并的序列中
        while(l<=mid) {
            temp[t++]=arr[l++];
        }
        //如果第一个序列未检测完，直接将后面所有元素加到合并的序列中
        while(r<=right) {
            temp[t++]=arr[r++];
        }

        //复制回原素组
        for (int i = left; i <=right; i++){
            arr[i]=temp[i];
        }
        System.out.println(Arrays.toString(temp));
        System.out.println(Arrays.toString(arr));
        System.out.println("------------------------");
    }
}
