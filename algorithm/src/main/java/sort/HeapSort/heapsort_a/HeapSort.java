package sort.HeapSort.heapsort_a;

import java.util.Arrays;

/**
 * @author ronin
 */
public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {4,6,8,5,9};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void heapSort(int[] arr){
        System.out.println("堆排序~");
        //分步骤完成
//        adjustHeap(arr,1,arr.length);
//        System.out.println(Arrays.toString(arr));
//        adjustHeap(arr,0,arr.length);
//        System.out.println(Arrays.toString(arr));

        //最终代码
        //将无序数组构造成一个大顶堆
        for (int i = arr.length/2-1; i >=0; i--) {
            adjustHeap(arr,i,arr.length);
        }
        //将堆顶元素与末尾元素交换
        int temp;
        for(int j=arr.length-1;j>0;j--){
            //交换
            temp = arr[j];
            arr[j] = arr[0];
            arr[0] = temp;
            adjustHeap(arr,0,j);
        }
    }

    /**i
     *
     * @param arr 待调整的数组
     * @param i 表示非叶子节点在数组中的索引
     * @param length 表示多少个元素继续调整，length在逐渐减少
     */
    public static void adjustHeap(int[] arr,int i,int length){
        //先取出当前元素的值，放在temp中
        int temp = arr[i];
        //k=i*2+1,k是i节点的左子节点
        for(int k=i*2+1;k<length;k=k*2+1){
            if(k+1<length && arr[k]<arr[k+1]){
                //让k指向右子节点
                k++;
            }
            if(arr[k]>temp){
                arr[i] = arr[k];
                i=k;
            }else{
                break;
            }
            //当for循环结束后，我们已经将以i为父节点的树的最大值，放在了最顶上
            arr[i] = temp;
        }
    }
}
