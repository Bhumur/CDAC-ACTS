package ads;

public class BinaryTree {

	Node root;
	
	public BinaryTree() {
		this.root= null;
	}
	
	private void preorder(Node root) {
		if(root!= null) {
			System.out.println(root.data);
			preorder(root.left);
			preorder(root.right);
		}
	}
	
	private void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
	}
	
	public void printUsingPreorder() {
		preorder(root);
		System.out.println();
	}
	
	public void printUsingpostorder() {
		postorder(root);
		System.out.println();
	}
	
	public int countNodes() {
		return countNodesHelper(root);
	}
	
	private int countNodesHelper(Node root) {
		if( root == null)
			return 0;
		return 1+ countNodesHelper(root.left)+ countNodesHelper(root.right);
	}
	
	public int CountLeafNodes() {
		return CountLeafNodesHelper(root);
	}
	
	private int CountLeafNodesHelper(Node root) {
		if(root == null)
			return 0;
			
		if(root.left == null && root.right == null)
			return CountLeafNodesHelper(root.left)+ CountLeafNodesHelper(root.right);
		return 0;
		
	}
}
