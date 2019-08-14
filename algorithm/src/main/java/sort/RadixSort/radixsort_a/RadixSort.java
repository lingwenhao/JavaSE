package sort.RadixSort.radixsort_a;

import java.util.Arrays;

/**
 * 基数排序:经典的空间换取时间的算法
 * @author ronin
 */
public class RadixSort {
    public static void main(String[] args) {
        int[] arr = {53,3,542,748,14,214};
        //radixSort(arr);
        radixSort1(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 原数组
     * @param arr
     */
    public static void radixSort(int[] arr){
        //第一轮排序，针对每个元素的个位进行处理
        //定义一个二维数组，每个桶就是一维数组
        //说明:
        //1.二维数组包含10个一维数组
        //2.为了防止数据溢出，则每一个一维数组(每一个桶),大小定位arr.length
        int[][] buckets = new int[10][arr.length];

        //为了记录每个桶中实际放了多少个数据，我们定义一个一维数组来记录每个桶中存放的元素的个数
        //如:bucketElementCount[0],就存放的是bucket[0]这个桶中存放的元素的个数
        int[] bucketElementCounts = new int[10];

        //第一轮，根据元素的个位进行排序
        for(int i=0; i<arr.length; i++){
            //取出每个元素个位的值
            int digitOfElement = arr[i]%10;
            //放入到对应的桶中,注意，此时:bucketElementCounts[digitOfElement]=0,因为bucketElementCounts中所有元素都是0
            buckets[digitOfElement][bucketElementCounts[digitOfElement]] = arr[i];
            bucketElementCounts[digitOfElement]++;
        }
        //按照这个桶的顺序(一维数组的下标一次取出数据，放入到原数组)
        int index = 0;
        //遍历每一个桶，并将桶中的数组放入到原数组
        for(int j=0; j<buckets.length; j++){
            //如果桶中有数据,才放入到原数组
            if(bucketElementCounts[j] != 0){
                //循环遍历该桶，即第j个桶(即第j个一维数组)
                System.out.println("第"+(j+1)+"个桶里面有"+bucketElementCounts[j]+"个元素");
                //bucketElementCounts记录第几个桶里面有几个元素
                for(int k=0; k<bucketElementCounts[j];k++){
                    arr[index] = buckets[j][k];
                    index++;
                }
                //每个桶中有多少个元素置为0
                bucketElementCounts[j] = 0;
            }
        }

        //第二轮，根据元素的十位进行排序
        for(int i=0; i<arr.length; i++){
            //取出每个元素个位的值
            int digitOfElement = arr[i]/10%10;
            //放入到对应的桶中,注意，此时:bucketElementCounts[digitOfElement]=0,因为bucketElementCounts中所有元素都是0
            buckets[digitOfElement][bucketElementCounts[digitOfElement]] = arr[i];
            bucketElementCounts[digitOfElement]++;
        }
        //按照这个桶的顺序(一维数组的下标一次取出数据，放入到原数组)
        index = 0;
        //遍历每一个桶，并将桶中的数组放入到原数组
        for(int j=0; j<buckets.length; j++){
            //如果桶中有数据,才放入到原数组
            if(bucketElementCounts[j] != 0){
                //循环遍历该桶，即第j个桶(即第j个一维数组)
                System.out.println("第"+(j+1)+"个桶里面有"+bucketElementCounts[j]+"个元素");
                //bucketElementCounts记录第几个桶里面有几个元素
                for(int k=0; k<bucketElementCounts[j];k++){
                    arr[index] = buckets[j][k];
                    index++;
                }
                //每个桶中有多少个元素置为0
                bucketElementCounts[j] = 0;
            }
        }

        //第三轮，根据元素的百位进行排序
        for(int i=0; i<arr.length; i++){
            //取出每个元素百位的值
            int digitOfElement = arr[i]/100%10;
            //放入到对应的桶中,注意，此时:bucketElementCounts[digitOfElement]=0,因为bucketElementCounts中所有元素都是0
            buckets[digitOfElement][bucketElementCounts[digitOfElement]] = arr[i];
            bucketElementCounts[digitOfElement]++;
        }
        //按照这个桶的顺序(一维数组的下标一次取出数据，放入到原数组)
        index = 0;
        //遍历每一个桶，并将桶中的数组放入到原数组
        for(int j=0; j<buckets.length; j++){
            //如果桶中有数据,才放入到原数组
            if(bucketElementCounts[j] != 0){
                //循环遍历该桶，即第j个桶(即第j个一维数组)
                System.out.println("第"+(j+1)+"个桶里面有"+bucketElementCounts[j]+"个元素");
                //bucketElementCounts记录第几个桶里面有几个元素
                for(int k=0; k<bucketElementCounts[j];k++){
                    arr[index] = buckets[j][k];
                    index++;
                }
                //每个桶中有多少个元素置为0
                bucketElementCounts[j] = 0;
            }
        }
    }

    /**
     * 原数组
     * @param arr
     */
    public static void radixSort1(int[] arr){
        //第一轮排序，针对每个元素的个位进行处理
        //定义一个二维数组，每个桶就是一维数组
        //说明:
        //1.二维数组包含10个一维数组
        //2.为了防止数据溢出，则每一个一维数组(每一个桶),大小定位arr.length
        int[][] buckets = new int[10][arr.length];

        //为了记录每个桶中实际放了多少个数据，我们定义一个一维数组来记录每个桶中存放的元素的个数
        //如:bucketElementCount[0],就存放的是bucket[0]这个桶中存放的元素的个数
        int[] bucketElementCounts = new int[10];

        //得到数组中最大的值
        int max = arr[0];
        for(int t=1; t<arr.length; t++){
            if(max < arr[t]){
                max = arr[t];
            }
        }
        int maxLength = String.valueOf(max).length();

        //得到最大的位数
        for(int i=0; i<maxLength;i++){
            //第一轮，根据元素的个位进行排序
            for(int j=0; j<arr.length; j++){
                //取出每个元素十位的值
                int digitOfElement = arr[j]/(int)Math.pow(10.,i)%10;
                //放入到对应的桶中,注意，此时:bucketElementCounts[digitOfElement]=0,因为bucketElementCounts中所有元素都是0
                buckets[digitOfElement][bucketElementCounts[digitOfElement]] = arr[j];
                bucketElementCounts[digitOfElement]++;
            }
            //按照这个桶的顺序(一维数组的下标一次取出数据，放入到原数组)
            int index = 0;
            //遍历每一个桶，并将桶中的数组放入到原数组
            for(int k=0; k<buckets.length; k++){
                //如果桶中有数据,才放入到原数组
                if(bucketElementCounts[k] != 0){
                    //循环遍历该桶，即第k个桶(即第k个一维数组)
                    System.out.println("第"+(k+1)+"个桶里面有"+bucketElementCounts[k]+"个元素");
                    //bucketElementCounts记录第几个桶里面有几个元素
                    for(int l=0; l<bucketElementCounts[k];l++){
                        arr[index] = buckets[k][l];
                        index++;
                    }
                    //每个桶中有多少个元素置为0
                    bucketElementCounts[k] = 0;
                }
            }
            System.out.println("第"+(i+1)+"次排序后结果:"+Arrays.toString(arr));
        }
    }
}
