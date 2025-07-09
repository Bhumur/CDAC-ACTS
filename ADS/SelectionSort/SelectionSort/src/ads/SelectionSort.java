package ads;

public class SelectionSort {

	public static void SelectionS(int[] arr) {
	
		int n = arr.length;
		for(int i=0 ; i< n-1 ; i++) {
			
			//Assume that current position holds the min element
			int min = i;
			
			//Iterate through the unsorted portion
			for(int j = i+1 ; j<n; j++) {
				if(arr[j] < arr[min]) {
					
					//update the min
					min= j;
				}
			}
			
			//Move the min to its correct position
			
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}
	
	public static void printArray(int[] arr) {
		for(int val : arr) {
			System.out.println(val + " ");
		}
		System.out.println();
	}
}
