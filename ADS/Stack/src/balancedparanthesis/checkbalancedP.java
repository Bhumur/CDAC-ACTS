package balancedparanthesis;

import java.util.Stack;

public class checkbalancedP {

	public static boolean isBalanced(String expr) {
	Stack<Character> stack = new Stack<> ();
	
	for(char ch : expr.toCharArray()) {
		
		//push opening symbols to stack
		if(ch == '(' || ch == '{' || ch == '[') {
			stack.push(ch);
			
			//Handle Closing symbols
		} else if (ch == ')' || ch == '}' || ch == ']') {
			if(stack.isEmpty()) return false;
			
			char top= stack.pop();
			
			if ((ch == ')' && top!= '(') ||
					(ch == '}' && top!= '{') ||
					(ch == ']' && top != '['))
				return false;
		}
	}
	return stack.isEmpty();
}
}
