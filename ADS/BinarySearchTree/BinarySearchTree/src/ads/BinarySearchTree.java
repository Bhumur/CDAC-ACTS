package ads;

public class BinarySearchTree {

	Node root;
	
	public void insert(int data) {
		root = insert(root, data);
	}
	
	private Node insert(Node root, int data) {
		if (root == null)
			return new Node(data);
		
		if(data < root.data)
			root.left = insert(root.left, data);
		else if (data > root.data)
			root.right = insert(root.right, data);
		return root;
	}
	
	public void inorder() {
		inorder(root);
		System.out.println();
	}
	
	private void inorder(Node root) {
		if(root != null) {
			inorder(root.left);
			System.out.println(root.data);
			inorder(root.right);
		}
	}
	
    public int height() {
        return height(root);
    }

    private int height(Node root) {
        if (root == null) return -1;
        return 1 + Math.max(height(root.left), height(root.right));
    }
    
    public int findSmallest() {
    	Node current = root;
    	if(current == null) throw new RuntimeException("Tree is empty");
    	while(current.left != null) {
    		current = current.left;
    	}
		return current.data;
    }
    
    public int findLargest() {
        Node current = root;
        if (current == null) throw new RuntimeException("Tree is empty");
        while (current.right != null)
            current = current.right;
        return current.data;
    }

    public void delete(int data) {
    	root = delete(root,data);
    }
    
    private Node delete(Node root, int data) {
    	if(root == null) 
    		return null;
    	if(data < root.data)
    		root.left = delete(root.left, data);
    	else if(data > root.data)
    		root.right = delete(root.right, data);
    	else {
    		if(root.left == null) return root.right;
    		if (root.right == null) return root.left;
    	}
    	
    	//find inorder predecessor
    	Node temp = root.left;
    	while(temp.right != null) {
    		temp = temp.right;
    		
    		root.data = temp.data;
    		root.left = delete(root.left, temp.data);
    	}
    	return root;
    }

}
