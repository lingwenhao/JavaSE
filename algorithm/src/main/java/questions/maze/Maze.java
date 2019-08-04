package questions.maze;

/**
 * 递归解决小球问题
 * @author ronin
 */
public class Maze {
    private static String[][] map = new String[8][7];

    /**
     * 初始化地图
     */
    static {
        //1代表围墙
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if(i == 0 || i == 7 || j == 0 || j == 6){
                    map[i][j] = "1";
                }else {
                    map[i][j] = "0";
                }
            }
        }
        //设置挡板
        map[3][1] = "1";
        map[3][2] = "1";
        //出口
        map[6][5] = "D";
    }

    /**
     * 打印地图
     */
    public static void print(){
        System.out.println("-------------------------");
        //1代表围墙
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.printf("%s\t",map[i][j]);
            }
            System.out.printf("\n");
        }
        System.out.println("-------------------------");
    }

    /**
     * 小球寻找出口的方法:如果小球到了map[6][5]的位置，说明小球已经找到了出口
     * 游戏规则:
     *      0:这个点还没有走过
     *      1:代表围墙
     *      路:表示该点是通路
     *      x:表示该点已经走过，但是走不通
     *      小球路径策略:下->右->上->左,如果到某一点走不通了,就回溯
     * @param i 小球起始位置
     * @param j 小球起始位置
     * @return
     */
    public static boolean findDoor(int i,int j){
        if(map[i][j].equals("D")){
            //如果找到了出口,则返回true
            return true;
        }else {
            //如果这个点没有走过
            if(map[i][j].equals("0")){
                //假设该点是路
                map[i][j] = "路";
                if(findDoor(i+1,j)){
                    //向下走
                    return true;
                }else if(findDoor(i,j+1)){
                    //向右走
                    return true;
                }else if(findDoor(i-1,j)){
                    //向上走
                    return true;
                }else if(findDoor(i,j-1)){
                    //向左走
                    return true;
                }else {
                    //回溯:设置该点为走不通状态
                    map[i][j] = "x";
                    return false;
                }
            }else {
                //说明是:1(围墙) 或 x:(该点已经走过，但是走不通)
                return false;
            }
        }
    }
}
