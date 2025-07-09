package ads;

public class BinarySearch {

static int binarySearch(int[] arr, int left, int right, int value) {
		
	if(left > right) {
		return -1; // base case: Element not found
	}
	
	int mid= left+ (right - left) /2;
	
	if( arr[mid] == value) return mid;
	if (arr[mid] > value) return binarySearch(arr, left, mid- 1, value);
	return binarySearch(arr, mid+1, right, value);	

	}
}
