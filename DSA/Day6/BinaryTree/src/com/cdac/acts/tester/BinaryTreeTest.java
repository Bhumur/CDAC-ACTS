package com.cdac.acts.tester;

import com.cdac.acts.tree.BinaryTree;

public class BinaryTreeTest {

	public static void main(String[] args) {
		BinaryTree btree = new BinaryTree();
		btree.buildBinaryTree2();
		System.out.print("PreOrder : ");
		btree.preOrder();
		System.out.print("InOrder : ");
		btree.inOrder();
		System.out.print("PostOrder : ");
		btree.postOrder();
		System.out.print("Level Order Traversal : ");
		btree.levelOrderTraversal();
		System.out.println("\nPreOder Count Node : " + btree.preOrderCount());
		System.out.println("Count Leaf : " + btree.countLeaf());
		System.out.println("Count Number of Nodes With value 2 : " + btree.CountNodesWithValue(2));
		
		System.out.println("\n\nInverting The Tree");
		btree.invertTree();
		System.out.print("PreOrder : ");
		btree.preOrder();
		System.out.print("InOrder : ");
		btree.inOrder();
		System.out.print("PostOrder : ");
		btree.postOrder();
		
		System.out.println("\n\n\nDepth Of Tree : " + btree.depth());
		System.out.print("Level Order Traversal : ");
		btree.levelOrderTraversal();
		System.out.print("\n\nDepthLevel Order Traversal : ");
		btree.depthlevelOrderTraversal();
	}

}
