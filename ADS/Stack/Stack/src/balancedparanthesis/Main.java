package balancedparanthesis;

public class Main {

	public static void main(String[] args) {

		String expr= "({[]}))";
		
		System.out.println(expr+ (checkbalancedP.isBalanced(expr) ? "is balanced" : "is not balanced"));
	}

}
