package stackProblems;

import java.util.Stack;

public class BalancedParanthesis {

	public static void main(String[] args) {
		
		String str ="{[]}";
		boolean val = isValid(str);
		System.out.println("out put is "+val);

	}
	
	public static boolean isValid(String str) {
		Stack<Character> stk=new Stack<Character>();
		for (int i=0; i<str.length();i++) {
			char  charAt = str.charAt(i);
			System.out.println(charAt);
			if(charAt=='{' || charAt=='[') {
				stk.push(charAt);
			} else {
				if (stk.isEmpty()) {
					return false;
				} else if(isMatching(stk.peek(),charAt)==false) {
					 return false;
				} else {
					stk.pop();
				}
			}
		}	
		return true;
	}

	public static boolean isMatching(char ch1, char ch2) {
		
		System.out.println("Char 1 is "+ch1);
		System.out.println("Char 2 is "+ch2);
		return (ch1=='{' && ch2=='}') || (ch1=='[' && ch2==']'); 
	}
}
