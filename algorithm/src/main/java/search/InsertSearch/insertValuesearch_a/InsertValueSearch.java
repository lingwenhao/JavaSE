package search.InsertSearch.insertValuesearch_a;

/**
 * 插值查找
 *      要求数组是有序的
 * @author ronin
 */
public class InsertValueSearch {
    public static void main(String[] args) {
        int[] arr = {1,5,8,9,15,36,45};
        int i = insetValueySearch(arr, 0, arr.length - 1, 99);
        System.out.println(i);
    }

    /**
     * 插值查找
     * @param arr
     * @param right
     * @param left
     * @param findValue
     * @return
     */
    public static int insetValueySearch(int[] arr,int left,int right,int findValue){
        if(left > right || findValue < arr[0] || findValue > arr[arr.length-1]){
            return -1;
        }
        int mid = left + (findValue-arr[left])/(arr[right] - arr[left])*(right - left);
        int midValue = arr[mid];
        if(findValue > midValue){
            //向右递归
            return insetValueySearch(arr,mid+1,right,findValue);
        }else if(findValue < midValue){
            //向左递归
            return insetValueySearch(arr,left,mid-1,findValue);
        }else {
            return mid;
        }
    }
}
