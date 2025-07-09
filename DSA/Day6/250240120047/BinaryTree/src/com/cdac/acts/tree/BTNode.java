package com.cdac.acts.tree;

public class BTNode {
	int data;
	BTNode left;
	BTNode right;
	
	public BTNode() {}
	
	public BTNode(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	public BTNode(int data, BTNode left, BTNode right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
}
