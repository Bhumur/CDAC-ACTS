package ads;

public class QuickSort {
	
	//partition with first element as pivot
	private static int partition(int[] arr, int start, int end) {
		int pivot= start;
		int left = start+1;
		int right = end;
		
		while(left <= right) {
			while(left <= right && arr[left] <= arr[pivot]) {
				left++;
			}
			
			while(left <= right && arr[pivot] <= arr[right]) {
				right--;
			}
			
			if(left < right) {
				int temp= arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
			
			int temp1= arr[pivot];
			arr[pivot] = arr[right];
			arr[right] = temp1;
		}
		return end;	
	}
	
	public static void quickSort(int[] arr, int start, int end) {
		if(end - start + 1 <= 1) {
			return;
		}
		
		int pivotpos = partition(arr,start,end);
		quickSort(arr, start, pivotpos-1);
		quickSort(arr, pivotpos+1, end);
	}
}
