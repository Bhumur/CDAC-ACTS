/*Implement following funtion to "optimally" multiple two numbers, recursively. Handle both negative and positive numbers.
int multiply(int a, int b);
*/


package ads;

import java.util.Scanner;

public class MultiplyTwoIntegers {

	public static int multiply(int x, int y) {
		 if (y == 0) {
	            return 0;
	        }
	        
	        if (y > 0) {
	            return x + multiply(x, y - 1);
	        } 
	        
	        else {
	            return -multiply(x, -y);
	        }
}

	public static void main(String[] args) {
	
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter 2 numbers : ");
			int x =sc.nextInt();
			int y = sc.nextInt();
			int res = multiply(x, y);
			System.out.println(res);

		}
	}

}

/*Enter 2 numbers : 
50
-6
-300
*/