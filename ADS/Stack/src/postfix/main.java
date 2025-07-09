package postfix;

public class main {

	public static void main(String[] args) {

		String expr = "5 1 2 + 4 * + 3 -";
		int result = evaluate_postfix.evaluate(expr);
		System.out.println("Result"+ result);
		
	}

}
