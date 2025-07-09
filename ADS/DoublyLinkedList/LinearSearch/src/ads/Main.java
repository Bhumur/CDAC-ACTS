package ads;

public class Main {

	public static void main(String[] args) {

		int[] arr ={10,20,30,40,50,};
		int key=60;
		
		LinearSearch ls = new LinearSearch();
		
		int index = ls.search(arr,key);
		if(index != -1) {
			System.out.println("Element found at Index:"+ index);
		}
		else {
			System.out.println("Element not found!!");
		}
	}

}
