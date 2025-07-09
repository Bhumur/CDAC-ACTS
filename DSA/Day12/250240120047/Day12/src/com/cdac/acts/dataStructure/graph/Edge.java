package com.cdac.acts.dataStructure.graph;

public class Edge {
	Integer vertex;
	Integer weight;
	
	public Edge() {
		this.vertex = null;
		this.weight = null;
	}
	
	public Edge(int vertex, int weight) {
		this.vertex = vertex;
		this.weight = weight;
	}
}
