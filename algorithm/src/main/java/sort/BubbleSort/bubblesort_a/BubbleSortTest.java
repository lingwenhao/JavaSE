package sort.BubbleSort.bubblesort_a;

/**
 * 测试冒泡排序
 * @author ronin
 * @version V1.0
 * @since 2019/8/8 9:16
 */
public class BubbleSortTest {
    public static void main(String[] args) {
        int[] num = {-1,-3,5,9,10,2,7};
        BubbleSort.bubbleSort(num);
        BubbleSort.show();
    }
}
