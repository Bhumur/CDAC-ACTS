package ads;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] arr = {5,2,7,1,8,9};
		System.out.println("Before"+ Arrays.toString(arr));
		
		QuickSort.quickSort(arr, 0, arr.length-1);
		System.out.println(" After Sorting : " + Arrays.toString(arr));

	}
}
