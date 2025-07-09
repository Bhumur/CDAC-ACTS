package com.cdac.acts.tester;

import java.util.Arrays;

import com.cdac.acts.Algorithms.Sorting;

public class SortingTest {

	public static void main(String[] args) {
		int [][]arr = {
				{11, 15, 8, 5, 7, 1, 6, 15, 2}//,
//				{21, 4,12},
//				{13},
//				{1,1,1,1,1,2,1,1,1,1,1},
//				{}
		};
		for(int i = 0;i <arr.length;i++) {
			System.out.print("\nUnSorted : ");
			System.out.println(Arrays.toString(arr[i]));
			Sorting.mergeSort(arr[i]);
			System.out.print("Sorted : ");
			System.out.println(Arrays.toString(arr[i]));
		}
		

	}

}
