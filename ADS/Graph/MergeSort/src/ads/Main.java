package ads;

public class Main {

	public static void main(String[] args) {
		
		int arr[] = {12,11,13,5,6,7};
		
		System.out.println("GIven Array is:");
		Mergesort.printArray(arr);
		
		Mergesort.sort(arr, 0, arr.length-1);
		
		System.out.println("Sorted Array is:");
		Mergesort.printArray(arr);
	}
}
