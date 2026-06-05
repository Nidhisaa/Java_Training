package DataStructures.Graph;

public class GraphUsingAraay_ {
    

static class Graph{
    int[][] graph;

    Graph(int vertex){
        graph = new int[vertex][vertex];
    }

    void addEdge(int src, int dest){
        graph[src][dest] = 1;
        graph[dest][src] = 1;
    }

    void printGraph(){
        for(int[] row : graph){
            for(int element : row){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
    }    

public class GraphUsingArray {
    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(2,3);
        g.addEdge(0,1);
        g.addEdge(1,2);

        g.printGraph();
    }
}

}
