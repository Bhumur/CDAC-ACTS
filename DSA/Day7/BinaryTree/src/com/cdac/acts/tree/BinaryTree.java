package com.cdac.acts.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree {
	BTNode root;
	
	public BinaryTree() {
		root = null;
	}
	
	// BinaryTreeBuilder
	public void buildBinaryTree1() {
		
		//			3
		//      2       4
		//  1     
		
		BTNode n4 = new BTNode(1,null,null);
		BTNode n3 = new BTNode(4,null,null);
		BTNode n2 = new BTNode(2,n4,null);
		BTNode n1 = new BTNode(3,n2,n3);
		root = n1;
	}
	
	public void buildBinaryTree2() {
		
		//			         10
		//             5             4
		//          3      2     7       9
 		//            8   6    15  12    11
		//                         17
		BTNode n13 = new BTNode(17,null,null);
		BTNode n12 = new BTNode(11,null,null);
		BTNode n11 = new BTNode(12,n13,null);
		BTNode n10 = new BTNode(15,null,null);
		BTNode n9 = new BTNode(6,null,null);
		BTNode n8 = new BTNode(8,null,null);
		BTNode n7 = new BTNode(9,null,n12);
		BTNode n6 = new BTNode(7,n10,n11);
		BTNode n5 = new BTNode(2,n9,null);
		BTNode n4 = new BTNode(3,null,n8);
		BTNode n3 = new BTNode(4,n6,n7);
		BTNode n2 = new BTNode(5,n4,n5);
		BTNode n1 = new BTNode(10,n2,n3);
		root = n1;
	}
	
	
	
	// PreOrder Traversal Print 
	private void preOrder(BTNode root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data +  " ");
		if(root.left!=null) {
			preOrder(root.left);
		}
		if(root.right!=null) {
			preOrder(root.right);
		}
	}
	public void preOrder() {
		preOrder(root);
		System.out.println();
	}
	
	
	// InOrder Traversal Print 
	private void inOrder(BTNode root) {
		if(root==null) {
			return;
		}
		
		if(root.left!=null) {
			inOrder(root.left);
		}
		System.out.print(root.data +  " ");
		if(root.right!=null) {
			inOrder(root.right);
		}
	}
	public void inOrder() {
		inOrder(root);
		System.out.println();
	}
	
	// PostOrder Traversal
	private void postOrder(BTNode root) {
		if(root==null) {
			return;
		}
		
		if(root.left!=null) {
			postOrder(root.left);
		}
		if(root.right!=null) {
			postOrder(root.right);
		}
		System.out.print(root.data +  " ");
	}
	public void postOrder() {
		postOrder(root);
		System.out.println();
	}
	
	//Count Of Leaf Node
		private int countLeaf(BTNode root) {
			if(root==null) {
				return 0;
			}
			if(root.left == null && root.right==null) {
				return 1;
			}
			return countLeaf(root.left) + countLeaf(root.right);
		}
		public int countLeaf() {
			return countLeaf(root);
		}
	
		// PreOrder Count
		private int preOrderCount(BTNode root) {
			if(root==null) {
				return 0;
			}
			return 1 + preOrderCount(root.left) + preOrderCount(root.right);
		}
		public int preOrderCount() {
			return preOrderCount(root);
		}
		
		// Count Node with value
		
		private int CountNodesWithValue(BTNode root ,int value) {
			if(root==null) {
				return 0;
			}

			if(root.data==value) {
				return 1 + CountNodesWithValue(root.left,value) + CountNodesWithValue(root.right,value); 
			}
			return CountNodesWithValue(root.left,value) + CountNodesWithValue(root.right,value);
		}
		
		public int CountNodesWithValue(int value) {
			return CountNodesWithValue(root,value);
		}
		
		//Mirror Image of Tree / Invert a binary Tree
		private void invertTree(BTNode root) {
			if(root==null) {
				return;
			}
			invertTree(root.left);
			invertTree(root.right);
			
			BTNode temp = root.left;
			root.left = root.right;
			root.right = temp;
			
			
		}
		public void invertTree() {
			invertTree(root);
		}
		
		
		//Depth of Tree
		private int depth(BTNode root,int depth) {
			if(root==null) {
				return 0;
			}
			if(root.left!=null || root.right!=null) {
				return max(depth(root.left,depth+1),depth(root.right,depth+1));
			}
			else {
				return depth;
			}
		}
		private int max(int a, int b) {
			if(a>b) {
				return a;
			}
			return b;
		}
		public int depth() {
			return depth(root,1);
		}

		// Breath First by depth first Using 2D List
		private void depthlevelOrderTraversal(List<List<Integer>> list, BTNode root, int depth) {
			if(root==null) {
				return;
			}
			list.get(depth).add(root.data);
			depthlevelOrderTraversal(list, root.left, depth+1);
			depthlevelOrderTraversal(list, root.right, depth+1);
		}
		
		public void depthlevelOrderTraversal() {
			List<List<Integer>> list = new ArrayList<>();
			int depth = depth();
			for(int i=0;i<depth;i++) {
				List<Integer> l = new ArrayList<>();
				list.add(l);
			}
			depthlevelOrderTraversal(list,root,0);
			for(List<Integer> l : list) {
				for(Integer i : l) {
					System.out.print(i + " ");
				}
			}
		}
		
		// Breath First by depth first using Array
//		private void depthLOTusingArray(int []arr,int depth, int index, BTNode root) {
//			if(root == null) {
//				return;
//			}
//			arr[index] = root.data;
//			depthLOTusingArray(arr,index+1,root.left);
//			depthLOTusingArray(arr,depth+1,root.right);
//		}
//		public void depthLOTusingArray() {
//			int []arr = new int[(int) (Math.pow(2,depth())-1)];
//			depthLOTusingArray(arr,0,root);
//			for(int i=0;i<arr.length;i++) {
//				System.out.print(arr[i] + " ");
//			}
//		}
//		
		
		// Breath First by LevelOrderTraversal
		private void levelOrderTraversal(BTNode root) {
			Queue<BTNode> queue = new LinkedList<>();
			queue.add(root);
			while(!queue.isEmpty()) {
				BTNode node = queue.poll();
				System.out.print(node.data + " ");
				if(node.left!=null) {
					queue.add(node.left);
				}
				if(node.right!=null) {
					queue.add(node.right);
				}
			}
		}
		
		public void levelOrderTraversal() {
			levelOrderTraversal(root);
		}
		
		
		private int height(BTNode root) {
	      	if(root==null){
	            return 0;
	        }
	        if(root.left==null && root.right==null){
	            return 0;
	        }
	        return 1 + Math.max(height(root.left),height(root.right));
	    }
		public int height() {
			return height(root);
		}
		
}
