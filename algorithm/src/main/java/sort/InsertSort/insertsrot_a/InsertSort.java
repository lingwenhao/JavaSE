package sort.InsertSort.insertsrot_a;

import java.util.Arrays;

/**
 * @author ronin
 */
public class InsertSort {
    public static void main(String[] args) {
        //insertSort1();
        System.out.println("--------------------------");
        insertSort2();
    }

    /**
     * 分步骤进行插入排序
     */
    private static void insertSort1() {
        int[] arr = {12,3,9,28};
        System.out.println("原数组:"+ Arrays.toString(arr));
        //第一轮
        int insertValue = arr[1];
        int insertIndex = 1-1;
        while(insertIndex >=0 && arr[insertIndex] > insertValue){
            arr[insertIndex+1] = arr[insertIndex];
            insertIndex--;
        }
        System.out.println("要插入的目标位置:"+insertIndex+1);
        arr[insertIndex+1] = insertValue;
        System.out.println("第一轮:"+Arrays.toString(arr));

        //第二轮
        insertValue = arr[2];
        insertIndex = 2-1;
        while(insertIndex >=0 && arr[insertIndex] > insertValue){
            arr[insertIndex+1] = arr[insertIndex];
            insertIndex--;
        }
        System.out.println("要插入的目标位置:"+insertIndex+1);
        arr[insertIndex+1] = insertValue;
        System.out.println("第二轮:"+Arrays.toString(arr));

        //第三轮
        insertValue = arr[3];
        insertIndex = 3-1;
        while(insertIndex >=0 && arr[insertIndex] > insertValue){
            arr[insertIndex+1] = arr[insertIndex];
            insertIndex--;
        }
        System.out.println("要插入的目标位置:"+insertIndex+1);
        arr[insertIndex+1] = insertValue;
        System.out.println("第三轮:"+Arrays.toString(arr));
    }

    /**
     * 一次完成插入排序
     */
    private static void insertSort2() {
        int[] arr = {12,3,9,28};
        System.out.println("原数组:"+ Arrays.toString(arr));
        //第一轮
        for(int i=0; i<arr.length-1; i++){
            int insertValue = arr[i+1];
            int insertIndex = i;
            while(insertIndex >=0 && arr[insertIndex] > insertValue){
                arr[insertIndex+1] = arr[insertIndex];
                insertIndex--;
            }
            System.out.println("要插入的目标位置:"+(insertIndex+1));
            arr[insertIndex+1] = insertValue;
            System.out.println("第"+(i+1)+"轮:"+Arrays.toString(arr));
        }
        System.out.println("排序后:"+Arrays.toString(arr));
    }
}
