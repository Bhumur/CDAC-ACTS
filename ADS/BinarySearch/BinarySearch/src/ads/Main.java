package ads;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		BinarySearch bs= new BinarySearch();
		
		int arr[]= {10,20,30,40,50};
		int value=50; 
		
		int index = bs.binarySearch(arr,0, arr.length-1,value);
		
		//if(index != -1) {
			System.out.println("Element found at Index!!" + index);
		//}
		//else {
			//System.out.println("Elemet not found!!");
		//}
		
	}
}
