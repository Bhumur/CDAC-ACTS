package com.cdac.acts.tree.bst;

public class BTNode {
	public int val;
	public BTNode left;
	public BTNode right;
	
	public BTNode () {
		
	}
	public BTNode(int val) {
		this.val = val;
		this.left = null;
		this.right = null;
	}
	
	public BTNode(BTNode left, int val, BTNode right) {
		this.val = val;
		this.left = null;
		this.right = null;
	}
}
