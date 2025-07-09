package com.cdac.acts.Algorithms;

public class Sorting {
	
	private static void mergeSort(int []arr, int start, int end, int []mergeArray) {
		
		if(start==end) {
			return;
		}
		int mid = start + (end - start)/2;
		mergeSort(arr, start, mid, mergeArray);
		mergeSort(arr, mid+1, end, mergeArray);
		merge(arr,start, mid, mid+1, end, mergeArray);
//		mergeInspace(arr,start, mid, mid+1, end);
	}
	
	private static void merge(int []arr, int s1, int e1, int s2, int e2, int []mergeArray) {
		int r = 0;
		int i1 = s1;
		int i2 = s2;
		while(i1<=e1 && i2<=e2) {
			if(arr[i1]<=arr[i2]) {
				mergeArray[r]=arr[i1];
				i1++;
			}else {
				mergeArray[r]=arr[i2];
				i2++;
			}
			r++;
		}
		while(i1<=e1) {
			mergeArray[r]=arr[i1];
			i1++;
			r++;
		}
		while(i2<=e2) {
			mergeArray[r]=arr[i2];
			i2++;
			r++;
		}
	
		for(int i=s1,x=0;i<=e2; i++, x++) {
			arr[i]=mergeArray[x];
		}
	}
	
//	private static void mergeInspace(int []arr, int s1, int e1, int s2, int e2) {
//		int i1 = s1;
//		int i2 = s2;
//		while(i1<=s1) {
//			if(arr[i1]<=arr[i2]) {
//				i1++;
//			}else {
//				int temp = arr[i1];
//				arr[i1] = arr[i2];
//				arr[i2] = temp;
//				i1++;
//				int s = i2;
//				while(s<e2 && arr[s]>arr[s+1] ) {
//					temp = arr[s];
//					arr[s] = arr[s+1];
//					arr[s+1] = temp;
//					s++;
//				}
//			}
//		}
//	}
	
	public static void mergeSort(int []arr) {
		int []mergeArray = new int[arr.length];
		mergeSort(arr, 0, arr.length-1, mergeArray);
	}
	
	private static int partition(int arr[], int start, int end) {
		int pivot = start;
		int left = start + 1;
		int right = end;
		while(right>=left) {
			while(right>=left && arr[left]<=arr[pivot]) {
				left++;
			}
			while(right>=left && arr[right]>arr[pivot]) {
				right--;
			}
			if(right>=left) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}
		int temp = arr[right];
		arr[right] = arr[pivot];
		arr[pivot] = temp;
		return right;
	}
	
	private static void quickSort(int arr[], int start, int end) {
		if(start>=end) {
			return;
		}
		int pivot = partition(arr, start, end);
		quickSort(arr, start, pivot-1);
		quickSort(arr, pivot+1, end);
	}
	
	public static void quickSort(int arr[]) {
		quickSort(arr, 0, arr.length-1);
	}
}
