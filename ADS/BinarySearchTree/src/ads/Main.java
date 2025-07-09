package ads;

public class Main {

	    public static void main(String[] args) {
	        BinarySearchTree bst = new BinarySearchTree();

	        // Insert values
	        int[] values = {50, 30, 70, 20, 40, 60, 80};
	        for (int val : values)
	            bst.insert(val);

	        System.out.print("In-order: ");
	        bst.inorder();

	        System.out.println("Height: " + bst.height());
	        System.out.println("Smallest: " + bst.findSmallest());
	        System.out.println("Largest: " + bst.findLargest());

	        System.out.println("Deleting 50...");
	        bst.delete(50);

	        System.out.print("In-order after deletion: ");
	        bst.inorder();
	    }
}
