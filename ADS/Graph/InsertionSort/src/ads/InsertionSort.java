package ads;

public class InsertionSort {

	public void sort(int arr[]) {
		
		int n = arr.length;
		for(int i=1 ; i<n ; i++) {
			int key = arr[i]; // The element we want to insert into the sorted position
			int j= i-1; //Points to last element of the sorted part of the array
			
			//Shifts the elements. This loop shifts the elements greater than key one position to right
			while(j >=0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key; //place the key to correct sorted position
		}
	}
	
	public static void printArray(int arr[]) {
		int n = arr.length;
		for(int i=0 ; i< n; i++) {
			System.out.println(arr[i]+ " ");
		}
		System.out.println();
	}
}
