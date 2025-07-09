package com.cdac.acts.algorithms;

public class Algorithms {
	public static boolean findUsingLinearSearch(int[] arr, int element) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==element) {
				return true;
			}
		}
		return false;
	}
	
	private static boolean findUsingBinarySearch(int[] arr, int element, int high, int low) {
		if(low>high) {
			return false;
		}
		int mid = low + (high-low)/2;
		if(arr[mid]==element) {
			return true;
		}
		if(arr[mid]<element) {
			return findUsingBinarySearch(arr, element, high, mid+1);
		}else
		{
			return findUsingBinarySearch(arr, element, mid-1, low);
		}
	}
	public static boolean findUsingBinarySearch(int[] arr, int element) {
		return findUsingBinarySearch(arr, element, arr.length-1, 0);
	}
	
	
	public static void bubbleSortAscending(int[] arr) {
		int n = 0;
		while(n<arr.length) {
			int unsortedSize = 0;
			while(unsortedSize < arr.length - n -1) {
				if(arr[unsortedSize] > arr[unsortedSize + 1]) {
					int temp = arr[unsortedSize];
					arr[unsortedSize] = arr[unsortedSize+1];
					arr[unsortedSize+1] = temp;
				}
				unsortedSize++;
			}
			n++;
		}
	}
	
	public static void bubbleSortDecending(int[] arr) {
		int n = 0;
		while(n<arr.length) {
			int unsortedSize = 0;
			while(unsortedSize < arr.length - n -1) {
				if(arr[unsortedSize] < arr[unsortedSize + 1]) {
					int temp = arr[unsortedSize];
					arr[unsortedSize] = arr[unsortedSize+1];
					arr[unsortedSize+1] = temp;
				}
				unsortedSize++;
			}
			n++;
		}
	}
	
	public static void insertionSortAcending(int[] arr) {
		int sortedSize = 1;
		while(sortedSize<arr.length) {
			int eleToInsert = arr[sortedSize];
			int i = sortedSize - 1;
			while(i>=0) {
				if(eleToInsert < arr[i]) {
					arr[i+1] = arr[i];
				}else {
					break;
				}
				i--;
			}
			
			arr[i+1] = eleToInsert;
			sortedSize++;
		}
	}
	
	public static void insertionSortDcending(int[] arr) {
		int sortedSize = 1;
		while(sortedSize<arr.length) {
			int eleToInsert = arr[sortedSize];
			int i = sortedSize - 1;
			while(i>=0) {
				if(eleToInsert > arr[i]) {
					arr[i+1] = arr[i];
				}else {
					break;
				}
				i--;
			}
			
			arr[i+1] = eleToInsert;
			sortedSize++;
		}
	}
	
	
	public static boolean isArraySorted(int[] arr) {
		int n = 0;
		while(n<arr.length-1) {
			if(arr[n]>arr[n+1]) {
				return false;
			}
			n++;
		}
		return true;
	}
}
