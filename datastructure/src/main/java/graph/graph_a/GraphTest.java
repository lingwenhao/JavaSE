package graph.graph_a;

/**
 * @author ronin
 */
public class GraphTest {
    public static void main(String[] args) {
        int n = 5;
        String[] vertexs = {"A","B","C","D","E"};
        //创建图对象
        Graph graph = new Graph(n);
        //循环的添加顶点
        for(String vertex:vertexs){
            graph.insertVerex(vertex);
        }
        //添加边:A->B A->C B->C B->D B->E
        graph.insertEdges(0,1,1);
        graph.insertEdges(0,2,1);
        graph.insertEdges(1,2,1);
        graph.insertEdges(1,3,1);
        graph.insertEdges(1,4,1);
        //打印邻接矩阵
        graph.showGraph();
        //深度优先遍历
        //graph.dfs();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        //广度优先遍历
            //注意:测试广度优先遍历之前不能测试深度优先遍历,因为测试完深度优先遍历后会将isVisited[]数组中值全部置为true
        graph.bfs();
    }
}
