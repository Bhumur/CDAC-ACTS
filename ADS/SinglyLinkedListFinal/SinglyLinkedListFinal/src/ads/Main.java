package ads;

public class Main {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		SLL sl = new SLL();
		
		Node head = null;
		
		head = sl.addatFirst(head, 10);
		head = sl.addatLast(head, 20);
		head = sl.addatLast(head, 30);
		head = sl.addatSpecifiedPosition(head, 25, 3);
		
		System.out.println("List Iterative Travesal");
		sl.traverse(head);
		
		System.out.println("List Recursive approach!!");
		sl.traverseList(head);
		
		
		int key = 20;
		System.out.println("Searchng for: "+ key + " :" + sl.search(head, key));
		System.out.println("Searchng for: "+ key + " :" + sl.SearchNode(head, key));
		
		System.out.println("No of Nodes"+sl.CountNodes(head));
		System.out.println("No of Nodes Recusive"+sl.NodeCount(head));
		
		
		head = sl.DeleteatFirst(head);
		head = sl.DeleteatLast(head);
		head = sl.DeleteatSpecifiedPosition(head, 2);
		
		sl.Reverse(head);
	}

}
