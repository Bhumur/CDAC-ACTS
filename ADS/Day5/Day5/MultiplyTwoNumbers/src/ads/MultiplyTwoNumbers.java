package ads;
import java.util.Scanner;

public class MultiplyTwoNumbers {
	
	public static int multiply(int x, int y) {
		
		if(x == 0 || y == 0) {
			return 0;
		}
		
		if(x == 1) {
			return y;
		}
		
		if(y == 1) {
			return x;
		}
		
		 return (x + multiply(x, y-1));
	}
	
	public static void main(String[] args) {
	
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter 2 numbers : ");
			int x =sc.nextInt();
			int y = sc.nextInt();
			
			int result = multiply(x, y);
			System.out.println("Product of " + x + " and " + y + " : " + result);
		}
	}
}
