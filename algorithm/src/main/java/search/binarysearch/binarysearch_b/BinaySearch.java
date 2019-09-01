package search.binarysearch.binarysearch_b;

/**
 * @author ronin
 */
public class BinaySearch {
    public static void main(String[] args) {
        int[] arr = {1,5,8,9,15,36,45};
        System.out.println(binarysearch(arr,5));
        System.out.println(binarysearch(arr,8));
        System.out.println(binarysearch(arr,45));
    }

    /**
     *
     * @param arr 带查找的数组,arr是升序排列
     * @param target 需要查找的数组
     * @return 返回对应的下标,-1表示没有找到
     */
    public static int binarysearch(int[] arr,int target){
        int left = 0;
        int right = arr.length - 1;
        while(left <=right){
            int mid = (left+right)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                right = mid - 1;
            }else {
                left = mid+1;
            }
        }
        return -1;
    }
}
