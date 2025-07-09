package com.cdac.acts.tester;

import com.cdac.acts.dataStructure.graph.Graph;

public class GraphTest {

	public static void main(String[] args) {

		Graph graph = new Graph(5, false);
//		graph.addEdge(1, 2);
//		graph.addEdge(1, 3);
//		graph.addEdge(1, 4);
//		graph.addEdge(2, 4);
//		
//		graph.BFS(1);
		
		
		graph.addEdge(2, 0);
		graph.addEdge(2, 1);
		graph.addEdge(2, 3);
		graph.addEdge(2, 4);
		graph.addEdge(1, 0);
		
		graph.BFS(0);
		graph.BFS(1);
		graph.BFS(2);
		graph.BFS(3);
		graph.BFS(4);
	}

}
