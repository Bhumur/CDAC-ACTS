package com.cdac.acts.tester;

import java.util.Arrays;

import com.cdac.acts.algorithms.Algorithms;

public class AlgorithmTest {

	public static void main(String[] args) {
		int []arr = {2,5,7,1,67,23,645,572,453,3452,426,35,32,346,2346,35352,24};
		
		System.out.println("Linear Search :::::::::::::::::::");
		
		System.out.println(Arrays.toString(arr));
		System.out.println("Array have 35 in it : " + Algorithms.findUsingLinearSearch(arr, 35));
		System.out.println("Array have 77 in it : " + Algorithms.findUsingLinearSearch(arr, 77));
		
		
		
		System.out.println("Binary Search :::::::::::::::::::");
		
		int []arr1 = {2,3,6,7,12,15,17,19,24,26,36};
		System.out.println(Arrays.toString(arr1));
		System.out.println("AArray have 7 in it : " + Algorithms.findUsingBinarySearch(arr1, 7));
		System.out.println("AArray have 27 in it : " + Algorithms.findUsingBinarySearch(arr1, 27));
		
		
		System.out.println("Bubble Sort :::::::::::::::::::");
		
		System.out.println(Arrays.toString(arr));
		Algorithms.bubbleSortAscending(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Arrays.toString(arr));
		Algorithms.bubbleSortDecending(arr);
		System.out.println(Arrays.toString(arr));
		
		
		
		System.out.println("Insertion Sort :::::::::::::::::::");
		
		System.out.println(Arrays.toString(arr));
		Algorithms.insertionSortAcending(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Arrays.toString(arr));
		Algorithms.insertionSortDcending(arr);
		System.out.println(Arrays.toString(arr));
		
		
		
		System.out.println("Is Sorted :::::::::::::::::::");
		
		System.out.println("Is Arr is sorted : " + Algorithms.isArraySorted(arr));
		
	}

}
