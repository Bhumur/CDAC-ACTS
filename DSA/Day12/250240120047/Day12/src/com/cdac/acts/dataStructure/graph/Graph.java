package com.cdac.acts.dataStructure.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Graph {
	List<List<Edge>> adjMatrix;
	Boolean isDirected;
	
	public Graph(int size, boolean tf) {
		this.adjMatrix = new ArrayList<>();
		this.isDirected = tf;
		for(int i=0;i<=size;i++) {
			List<Edge> l = new ArrayList<>();
			adjMatrix.add(l);
		}
	}
	
	
	public void addEdge(int u, int v) {
		addEdge(u, v, 1);
	}
	public void addEdge(int u, int v, int weight) {
		if(isDirected) {
			adjMatrix.get(u).add(new Edge(v, weight));
		}else {
			adjMatrix.get(u).add(new Edge(v, weight));
			adjMatrix.get(v).add(new Edge(u, weight));
		}
	}
	
	public void BFS(int a) {
		List<Boolean> isVisited = new ArrayList<>();
		for(int i=0;i<=adjMatrix.size();i++) {
			isVisited.add(false);
		}
		
		Queue<Integer> queue = new ConcurrentLinkedQueue<>();
		queue.add(a);
		
		while(!queue.isEmpty()) {
			int x = queue.poll();
			if(!isVisited.get(x)) {
				isVisited.set(x, true);
				System.out.print(x + " ");
				for(Edge e : adjMatrix.get(x)) {
					if(!isVisited.get(e.vertex)) {
						queue.add(e.vertex);
					}
				}
			}
		}
		System.out.println();
	}
	
}
