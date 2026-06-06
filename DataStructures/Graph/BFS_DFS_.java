package DataStructures.Graph;
import java.util.*;
public class BFS_DFS_ {
    


static class Graph{
	private final int vertices;
	private final List<List<Integer>> adjList;

	Graph(int vertex){
		this.vertices = vertex;
		adjList = new ArrayList<>();
		for (int i = 0; i < vertices; i++) {
			adjList.add(new ArrayList<>());
		}
	}

	void addEdge(int src, int dest){
		// undirected graph
		adjList.get(src).add(dest);
		adjList.get(dest).add(src);
	}

	void BFS(int start){
		if (start < 0 || start >= vertices) return;
		boolean[] visited = new boolean[vertices];
		Queue<Integer> q = new LinkedList<>();
		visited[start] = true;
		q.add(start);

		while(!q.isEmpty()){
			int v = q.poll();
			System.out.print(v + " ");
			for (int nei : adjList.get(v)){
				if (!visited[nei]){
					visited[nei] = true;
					q.add(nei);
				}
			}
		}
		System.out.println();
	}

	void DFS(int start){
		if (start < 0 || start >= vertices) return;
		boolean[] visited = new boolean[vertices];
		dfsUtil(start, visited);
		System.out.println();
	}

	private void dfsUtil(int v, boolean[] visited){
		visited[v] = true;
		System.out.print(v + " ");
		for (int nei : adjList.get(v)){
			if (!visited[nei]) dfsUtil(nei, visited);
		}
	}
}
	public static void main(String[] args){
		Graph g = new Graph(6);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 3);
		g.addEdge(3, 4);
		g.addEdge(4, 5);

		System.out.print("BFS starting from 0: ");
		g.BFS(0);

		System.out.print("DFS starting from 0: ");
		g.DFS(0);
	}
}

