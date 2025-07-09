package ads;

public class LinearSearch {

	static int search(int[] arr, int key) {
		
		for(int i=0 ; i<arr.length; i++) { // Traverse each element
			if(arr[i] == key) {
				return i; // return index if found
			}
		}
		return -1; // return -1 if not found
		
	}
}

