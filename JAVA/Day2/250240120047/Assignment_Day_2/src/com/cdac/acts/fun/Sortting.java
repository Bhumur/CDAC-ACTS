package com.cdac.acts.fun;

public class Sortting{
	public static void sort(int[] arr){
		int size = arr.length;
		for(int i=0;i<size;i++){
			for(int j=i+1;j<size;j++){
				if(arr[i]>arr[j]){
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
}