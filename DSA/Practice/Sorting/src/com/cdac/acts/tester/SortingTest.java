package com.cdac.acts.tester;

import java.util.Arrays;

import com.cdac.acts.Algorithms.Sorting;

public class SortingTest {

	public static void main(String[] args) {
		int []arr = {11, 15, 8, 5, 7, 1, 6, 15, 2};
		System.out.println(Arrays.toString(arr));
		Sorting.quickSort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
