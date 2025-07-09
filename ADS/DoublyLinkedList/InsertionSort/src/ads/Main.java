package ads;

public class Main {

	public static void main(String[] args) {
		int arr[] = {12,11,13,5,6};
		
		InsertionSort i = new InsertionSort();
		i.sort(arr);
		i.printArray(arr);
	}
}
