package com.cdac.acts.tree;

import com.cdac.acts.exception.ElementNotFoundException;
import com.cdac.acts.exception.TreeIsEmptyException;
import com.cdac.acts.tree.bst.BTNode;

public class BinarySearchTree {
	BTNode root;
	
	public BinarySearchTree() {
		this.root = null;
		
	}
	
	public void insert(int ele) {
		BTNode newNode = new BTNode(ele);
		if(root==null) {
			root=newNode;
			return;
		}
		BTNode curr = root;
		while(curr!=null) {
			if(curr.val<ele) {
				if(curr.right==null) {
					curr.right = newNode;
					return;
				}
				curr = curr.right;
			}
			else {
				if(curr.left==null) {
					curr.left = newNode;
					return;
				}
				curr = curr.left;
			}
		}
	}
	
	public void delete(int ele) throws TreeIsEmptyException, ElementNotFoundException {
		if(root==null) {
			throw new TreeIsEmptyException("Tree Empty");
		}
		BTNode parent = null;
		BTNode curr = root;
		while(curr!=null) {
			if(ele==curr.val) {
				break;
			}
			parent = curr;
			if(ele<curr.val) {
				curr = curr.left;
			}else {
				curr = curr.right;
			}
		}

		
		if(curr == null) {
			throw new ElementNotFoundException("Element Not Found");
		}
		
		
		// delete leaf node
		
		if(curr.left==null && curr.right==null) {
			if(parent==null) {
				root=null;
				return;
			}
			if(parent.left==curr) {
				parent.left = null;
				return;
			}else {
				parent.right = null;
			}
		}
		
		// delete current with one child
		
		if(curr.left==null && curr.right!=null) {
			if(parent.right == curr) {
				parent.right = curr.right;
			}else {
				parent.left = curr.right;
			}
		}
		if(curr.left!=null && curr.right==null) {
			if(parent.right == curr) {
				parent.right = curr.left;
			}else {
				parent.left = curr.left;
			}
		}
		
		
		// delete current with both child
		BTNode succ = curr.right;
		BTNode succParent = curr;
		
		while(succ.left!=null) {
			succParent = succ;
			succ = succ.left;
		}
		curr.val = succ.val;
		
		//leaf
		if(succ.left==null && succ.right==null) {
			if(succParent.left==succ) {
				succParent.left = null;
			}
			else {
				succParent.right = null; 
			}
		}
		//oneNode
		if(succ.left==null && succ.right!=null) {
			if(succParent.right == succ) {
				succParent.right = succ.right;
			}else {
				succParent.left = succ.right;
			}
		}
		if(succ.left!=null && succ.right==null) {
			if(succParent.right == succ) {
				succParent.right = succ.left;
			}else {
				succParent.left = succ.left;
			}
		}
		
		
	}
	
	public boolean search(int ele) {
		if(root==null) {
			return false;
		}
		BTNode curr = root;
		while(curr!=null) {
			if(curr.val == ele) {
				return true;
			}
			if(ele<curr.val) {
				curr = curr.left;
			}
			else {
				curr = curr.right;
			}
		}
		return false;
	}
	
	
	// INORDER TRAVERSAL
	private void inOrder(BTNode root) {
		if(root==null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.val + " ");
		inOrder(root.right);
	}
	public void inOrder() {
		inOrder(root);
		System.out.println();
	}
	
	//Smallest
	public int smallest() throws TreeIsEmptyException {
		if(root==null) {
			throw new TreeIsEmptyException("Tree Empty");
		}
		BTNode curr = root;
		while(curr.left!=null) {
			curr = curr.left;
		}
		return curr.val;
	}
	
	//Largest
		public int largest() throws TreeIsEmptyException {
			if(root==null) {
				throw new TreeIsEmptyException("Tree Empty");
			}
			BTNode curr = root;
			while(curr.right!=null) {
				curr = curr.right;
			}
			return curr.val;
		}
}
