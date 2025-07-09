package ads;

public class Main {

	public static void main(String[] args) {
		Graph g = new Graph(5);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);

        g.printBFS(0); // Output: BFS: 0 1 2 3 4

	}
}
