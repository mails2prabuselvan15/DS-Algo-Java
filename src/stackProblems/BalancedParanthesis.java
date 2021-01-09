package stackProblems;

import java.util.Stack;

public class BalancedParanthesis {

	public static void main(String[] args) {
		
//		String str ="{[]}";
		String str = "[";
		boolean val = isValid(str);
		System.out.println("out put is "+val);

	}
	
	public static boolean isValid(String s) {
		Stack<Character> stk=new Stack<Character>();
		for (int i=0; i<s.length();i++) {
			char  charAt = s.charAt(i);
			System.out.println(charAt);
			if(charAt=='{' || charAt=='[') {
				stk.push(charAt);
			} else {
				if (stk.isEmpty()) {
					return false;
				} else if(isMatching(stk.peek(),charAt)==false) {
					 return false;
				}else {
					stk.pop();
				}
			}
		}
		if (stk.isEmpty()) return true;
		else return false;
	}

	public static boolean isMatching(char ch1, char ch2) {
		return (ch1=='{' && ch2=='}') || (ch1=='[' && ch2==']' || (ch1=='{' && ch2=='}') || (ch1=='(' && ch2==')')); 
	}
}
