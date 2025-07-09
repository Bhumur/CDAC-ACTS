package ads;

public class Main {

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		
		tree.root = new Node(5);
		tree.root.left= new Node(4);
		tree.root.right = new Node(6);
		
		tree.root.left.left = new Node(3);
		tree.root.left.right = new Node(5);
		
        tree.root.right.right = new Node(5);
        
       System.out.println("Pre-order Traversal:");
       tree.printUsingPreorder();
       
       System.out.println("post order");
       tree.printUsingpostorder();
       
       tree.countNodes();
       tree.CountLeafNodes();
	}

}
