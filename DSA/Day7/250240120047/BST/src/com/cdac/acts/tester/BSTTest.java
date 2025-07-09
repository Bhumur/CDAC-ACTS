package com.cdac.acts.tester;

import com.cdac.acts.exception.ElementNotFoundException;
import com.cdac.acts.exception.TreeIsEmptyException;
import com.cdac.acts.tree.BinarySearchTree;

public class BSTTest {

	public static void main(String[] args) throws TreeIsEmptyException, ElementNotFoundException {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(50);
		bst.insert(40);
		bst.insert(60);
		bst.insert(30);
		bst.insert(70);
		bst.insert(45);
		bst.insert(80);
		bst.insert(10);
		bst.insert(90);
		bst.delete(40);
		System.out.println("Smallest element in tree : " + bst.smallest());
		System.out.println("Largest element in tree : " + bst.largest());
		System.out.print("Inorder Traversal : ");
		bst.inOrder();
	}

}
