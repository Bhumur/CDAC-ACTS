/*Write recursive algorithm to find quotient after dividing two numbers.
   Using above definition, implement following function to return quotient after dividing two numbers (a / b).
int quotient(int a, int b);
*/

package ads;

import java.util.Scanner;

public class QuotientRecursion {

	
	public static void main(String[] args) {
		int n , m;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter 2 numbers : ");
			n = sc.nextInt();
			m = sc.nextInt();
		}
		System.out.println(quotient(n, m, 0));

	}

	private static int quotient(int x, int y, int counter) {
		 if (y == 0) {
	            return -1;
	        }
	        
	        if (y > 0) {
	        	counter++;
	            return x + quotient(x, y - 1, counter);
	           
	        } 
	        
	        else {
	        	counter++;
	            return -quotient(x, -y, counter);
	        }
	}

}
