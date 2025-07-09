package ads;

public class bubblesort {

	public static void bubbleS(int arr[], int n) {
		int i,j,temp;
		boolean swapped;
		
		for(i=0 ; i< n-1; i++) {
			 swapped = false;
			 
			 for( j=0; j< n-i-1; j++) //Go up to the last unsorted element.
			 {
				 if(arr[j] > arr[j+1]) {
					 
					 //swap arr[j] and arr[j+1]
					 temp= arr[j];
					 arr[j] = arr[j+1];
					 arr[j+1] = temp;
					 swapped = true;
				 }
			 }
			 
			 if(swapped == false)
				 break;
		}
	}
	
	public static void printArray(int arr[], int size) {
		int i;
		for(i =0 ; i< size; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}
}
