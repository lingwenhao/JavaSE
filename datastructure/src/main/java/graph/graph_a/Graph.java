package graph.graph_a;

import java.util.*;

/**
 * @author ronin
 */
public class Graph {
    /**存储顶点*/
    private ArrayList<String> verexList;
    /**存储图对应的邻接矩阵*/
    private int[][] edges;
    /**表示边的数目*/
    private int numOfEdges;
    /**记录某个节点是否被访问*/
    public boolean[] isVieited ;

    /**
     * 构造矩阵
     * @param n
     */
    public Graph(int n){
        edges = new int[n][n];
        verexList = new ArrayList<String>(n);
        numOfEdges = 0;
        isVieited = new boolean[5];
    }

    /**
     * 得到第一个邻接节点的下标w
     * @param index
     * @return
     */
    public int getFirstNeighbo(int index){
        for(int j=0;j<verexList.size();j++){
            if(edges[index][j] > 0){
               return j;
            }
        }
        return -1;
    }

    /**
     * 根据前一个邻接节点获取下一个邻接节点
     */
    public int getNextNeighbo(int v1,int v2){
        for(int j=v2+1;j<verexList.size();j++){
            if(edges[v1][j] > 0){
                return j;
            }
        }
        return -1;
    }

    /**
     * 深度优先遍历
     * @param isVieited
     * @param i
     */
    private void dfs(boolean[] isVieited,int i){
        //访问该节点,输出
        System.out.println(getValueByIndex(i)+"->");
        //将节点设置为已访问
        isVieited[i] = true;
        //对应第二步
        int w = getFirstNeighbo(i);
        while(w != -1){
            //说明有邻接节点
            if(!isVieited[w]){
                dfs(isVieited,w);
            }
            //如果w节点已经被访问过
            w = getNextNeighbo(i,w);
        }
    }

    public void dfs(){
        //遍历所有的节点
        for(int i=0;i<getNumberOfVertex();i++){
            if(!isVieited[i]){
                dfs(isVieited,i);
            }
        }
    }

    /**
     * 广度优先遍历
     * @param isVieited
     * @param i
     */
    public void bfs(boolean[] isVieited,int i){
        //表示队列头节点对应下标
        int u;
        //邻接节点w
        int w;
        //队列,记录节点访问顺序
        LinkedList<Integer > queue = new LinkedList<>();
        //访问节点,输出节点信息
        System.out.println(getValueByIndex(i)+"->");
        //标记为已访问
        isVieited[i] = true;
        //将节点加入队列
        queue.addLast(i);
        while(!queue.isEmpty()){
            //取出队列的头节点下标
            u = (Integer)queue.removeFirst();
            //得到第一个邻接节点的下标
            w = getFirstNeighbo(u);
            while(w != -1){
                //是否被访问过
                if(!isVieited[w]){
                    System.out.println(getValueByIndex(w)+"->");
                    //标记已经被访问
                    isVieited[w] = true;
                    //入队列
                    queue.addLast(w);
                }
                //以u为前驱节点,找w后面的下一个邻接节点
                //体现出广度优先的遍历特点
                w = getNextNeighbo(u,w);
            }
        }
    }

    public void bfs(){
        for(int i=0;i<getNumberOfVertex();i++){
            if(!isVieited[i]){
                bfs(isVieited,i);
            }
        }
    }
    /**
     * 插入节点
     * @param vertex
     */
    public void insertVerex(String vertex){
        verexList.add(vertex);
    }

    /**
     *
     * @param v1 v1表示点的下标,即第几个顶点 “A”-"B" "A"->0 "B"->1
     * @param v2 v2表示第二个顶点对应的下标
     * @param weight
     */
    public void insertEdges(int v1,int v2,int weight){
        edges[v1][v2] = weight;
        edges[v2][v1] = weight;
        numOfEdges++;
    }

    /**
     * 返回节点的个数
     * @return
     */
    public int getNumberOfVertex(){
        return verexList.size();
    }

    /**
     * 得到边的数目
     * @return
     */
    public int getNumOfEdges() {
        return numOfEdges;
    }

    /**
     * 返回接待你i(下标)对应的数据 0->"A" 1->"B" 2->"C"
     * @param i
     * @return
     */
    public String getValueByIndex(int i){
        return verexList.get(i);
    }

    /**
     * 显示矩阵
     */
    public void showGraph(){
       for(int[] link: edges){
           System.out.println(Arrays.toString(link));
       }
    }
}
