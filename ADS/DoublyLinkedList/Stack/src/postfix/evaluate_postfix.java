package postfix;

import java.util.Stack;

public class evaluate_postfix {

	public static int evaluate(String expression) {
		
		Stack<Integer> stack = new Stack<>();
		
		for(String token : expression.split(" ")) {
			if(token.matches("\\d+")) { //if it is a number
				stack.push(Integer.parseInt(token));
			} else {
				int right= stack.pop();
				int left = stack.pop();
				switch(token) {
				
				case "+":
					stack.push(left + right);
					break;
				
				case "-":
					stack.push(left- right);
					break;
					
				case "*" :
					stack.push(left * right);
					break;
				
				case "/" :
					stack.push(left / right);
					break;
				
			}
		}
				
	}
		return stack.pop();
}
}
