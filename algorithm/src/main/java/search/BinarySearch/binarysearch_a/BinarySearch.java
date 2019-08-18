package search.BinarySearch.binarysearch_a;

/**
 * 二分查找
 * @author ronin
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,5,8,9,15,36,45};
        int i = binarySearch(arr, 0, arr.length - 1, -2);
        System.out.println(i);
    }

    /**
     * 二分查找
     * @param arr
     * @param right
     * @param left
     * @param findValue
     * @return
     */
    public static int binarySearch(int[] arr,int left,int right,int findValue){
       if(left > right){
           return -1;
       }
        int mid = (right +left)/2;
        int midValue = arr[mid];
        if(findValue > midValue){
            //向右递归
            return binarySearch(arr,mid+1,right,findValue);
        }else if(findValue < midValue){
            //向左递归
            return binarySearch(arr,left,mid-1,findValue);
        }else {
            return mid;
        }
    }
}
