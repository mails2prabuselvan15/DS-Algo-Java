package stringProblems;

import java.util.Stack;

public class ReverseWordsinaStringSol2 {
//	using stack
	public static void main(String args[]) {
		
		Stack<String> stk = new Stack<String>();
		
		String str= "Welcome to Gfg";
		
		char[] charArray = str.toCharArray();
		String temp="";
		
		for (char ch : charArray) {
			if(ch==' ') {
				stk.push(temp);
				temp="";
			}else {
				temp+=ch;
			}   
        }
		stk.push(temp);
		
		temp="";
		while(!stk.isEmpty()) {
			String pop = stk.pop();
			temp=temp+ pop + " ";
		}
		System.out.println("After Reverse "+ temp);
	}
}
