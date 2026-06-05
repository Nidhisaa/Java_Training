package DataStructures.Graph;

public class GraphUsingAdjacency_ {

    static class GNode {
        int vertex;
        GNode next;

        GNode(int vertex) {
            this.vertex = vertex;
            this.next = null;
        }
    }

    static class Graphs {
        int numVertices;
        GNode[] adjList;

        Graphs(int vertices) {
            numVertices = vertices;
            adjList = new GNode[vertices];
        }

        void addEdge(int source, int destination) {
            GNode newNode = new GNode(destination);
            newNode.next = adjList[source];
            adjList[source] = newNode;

            newNode = new GNode(source);
            newNode.next = adjList[destination];
            adjList[destination] = newNode;
        }

        void printGraph() {
            for (int v = 0; v < numVertices; v++) {
                System.out.print("Vertex " + v + ": ");
                GNode temp = adjList[v];
                while (temp != null) {
                    System.out.print(temp.vertex + " -> ");
                    temp = temp.next;
                }
                System.out.println("NULL");
            }
        }
    }

    public static void main(String[] args) {
        Graphs gr = new Graphs(4);
        gr.addEdge(0, 2);
        gr.addEdge(1, 3);
        gr.printGraph();
    }
}
