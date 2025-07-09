package ads;

public class Main {

	public static void main(String[] args) {

		int arr[] = {64,25,12,22,11};
		
		System.out.println("Original Array:");
		SelectionSort.printArray(arr);
		
		System.out.println("Sorted Array:");
		SelectionSort.SelectionS(arr);
		SelectionSort.printArray(arr);
	}

}
