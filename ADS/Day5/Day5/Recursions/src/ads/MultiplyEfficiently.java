package ads;

public class MultiplyEfficiently {

	public static int multiply(int x, int y) {
		
		if(check(x, y)) {
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
		return 0;
}
	
	//check if (x>y), if not then swap x and y values 
	
	public static boolean check(int x, int y) {
		if(x > y) {
			return true;
		}
		//swap
		else {
			int temp;
			temp = x;
			x = y;
			y = temp;
			//System.out.println("x and y: " +x + y);
			return true;
		}
		
	}
	
	public static void main(String[] args) {

		int result = multiply(2, 10);
		int result2 = multiply(5, 3);
		System.out.println("x < y : " + result);
		System.out.println("x > y : " + result2);

	}

}


/*
x < y : 20
x > y : 15
*/