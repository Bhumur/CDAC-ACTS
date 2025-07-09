package ads;

public class Tester1 {

	public static void function(int n) {
		if(n!=0) {
			function(n-1);
			System.out.println(n);
		}
	}
	public static void func(int n) {
		if(n != 0) {
			System.out.println(n);
			func(n-1);
		}
	}
	public static void main(String[] args) {
		
		function(5);
		System.out.println("------------------");
		func(5);

	}

}
