package stackProblems;

import java.util.Stack;

public class IsValidParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "()[]{}";
		boolean valid = isValid(str);
	}
	
	public static boolean isValid(String str) {
		
		Stack<Character> stk = new Stack<Character>();
		for (int i=0;i< str.length();i++) {
			char charAt = str.charAt(i);
			if (charAt=='(' || charAt=='[' || charAt=='{') {
				stk.push(charAt);
			} else {
				if (stk.isEmpty()) {
					return false;
				} else if ( isMatching(stk.peek(), charAt)== false) {
					return false;
				} else {
					stk.pop();
				}
			}
		}
		return true;
	}
	
	public static boolean isMatching(char ch1, char ch2) {

		if ( (ch1=='(' && ch2==')') || (ch1=='[' && ch2==']') || (ch1=='{' && ch2=='}') ){
			return true;
		} else {
			return false;
		}
	}
 
}
