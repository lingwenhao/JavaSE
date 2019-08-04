package array.array_a;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 稀疏数组
 */
public class SparseArray {

    /**
     * 创建原始的二维数组:
     *      规格:11*11
     *      0:没有棋子
     *      1:蓝子
     *      2:黑子
     */
    @Test
    public void fun(){
        System.out.println("--------------原始的二维数组--------------");
        int[][] chessArray = new int[11][11];
        chessArray[1][2] = 1;
        chessArray[2][4] = 2;
        //打印数组
        print(chessArray);
        System.out.println("--------------原始的二维数组--------------");
        /**
         * 二维数组转稀疏数组
         *      1.先遍历二维数组，得到有效值的个数
         */
        int sum = 0;
        List<Map<String,Integer>> list = new ArrayList<>();
        for (int row = 0; row < chessArray.length; row++) {
            int[] temp = chessArray[row];
            for (int col = 0; col < temp.length; col++) {
                if(0 != temp[col]){
                    Map<String,Integer> map = new HashMap<>();
                    map.put("row",row);
                    map.put("col",col);
                    map.put("value",temp[col]);
                    list.add(map);
                    sum ++ ;
                }
            }
        }
        System.out.println("有效值的个数:"+sum);
        System.out.println("原始数组中有效值:"+list.toString());
        /**
         * 2.根据有效值的个数创建稀疏数组
         */
        int[][] parseChessArray = new int[sum+1][3];
        parseChessArray[0][0] = 11;
        parseChessArray[0][1] = 11;
        parseChessArray[0][2] = sum;
        //把原数组中有效值填充到稀疏数组中
        for(int i=0; i<list.size() ; i++) {
            parseChessArray[i+1][0] = list.get(i).get("row");
            parseChessArray[i+1][1] = list.get(i).get("col");
            parseChessArray[i+1][2] = list.get(i).get("value");
        }
        System.out.println("--------------稀疏数组--------------");
        print(parseChessArray);
        System.out.println("--------------稀疏数组--------------");

        /**
         * 3.根据稀疏数组parseChessArray中存放的值还原数组
         */
        int[][] source= parseChessArray;
        //创建数组
        int[][] target = new int[source[0][0]][source[0][1]];
        //还原
        for (int row = 0; row < source.length; row++) {
            int[] temp = source[row];
            for (int col = 0; col < temp.length; col++) {
                //从第二行开始，第一行存放的是原数组的相关信息
                if(row > 0 ) {
                    target[source[row][0]][source[row][1]] = source[row][2];
                }
            }
        }
        System.out.println("--------------根据稀疏数组还原的数组--------------");
        print(target);
        System.out.println("--------------根据稀疏数组还原的数组--------------");
    }

    /**
     * 打印数组
      * @param array
     */
    private void print(int[][] array) {
        for (int[] row : array) {
            for (int col : row) {
                System.out.print(col+"\t");
            }
            System.out.println();
        }
    }
}
