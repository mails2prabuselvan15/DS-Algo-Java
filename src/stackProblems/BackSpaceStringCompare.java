package stackProblems;

import java.util.Stack;

public class BackSpaceStringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		String str1 = "ab#c" ; 
//		String str2 = "ad#c" ;

//		String str1 = "ab##" ; 
//		String str2 = "c#d#" ;
		
		
//		String str1 = "a##c" ; 
//		String str2 = "#a#c" ;
		
//		String str1 = "a#c" ; 
//		String str2 = "b" ;
		
		String str1= "y#fo##f";
		String str2= "y#f#o##f";
		
		boolean remove = remove(str1, str2);
		System.out.println("Output is "+ remove);
	}

	
	public static boolean remove(String S, String T) {
		String temp1= "";
		String temp2= "";
		Stack<Character> stk1 = new Stack<Character>();
		Stack<Character> stk2 = new Stack<Character>();
		for (int i=0; i<S.length();i++) {
			char charAt = S.charAt(i);
			if(!stk1.isEmpty() && charAt =='#') {
				stk1.pop();
			}  else if (stk1.isEmpty() && charAt=='#') {
				continue;
			} else {
				stk1.push(charAt);				
			}
		}
		for (int i=0; i <T.length(); i++) {
			char charAt= T.charAt(i);
			if(!stk2.isEmpty() && charAt== '#') {
				stk2.pop();
			} else if (stk2.isEmpty() && charAt=='#') {
				continue;
			} else {
				stk2.push(charAt);				
			}
		}
		while (!stk1.isEmpty()) {
			char pop = stk1.pop();
			temp1+=pop;
		}
		while (!stk2.isEmpty()) {
			char pop = stk2.pop();
			temp2+=pop;
		}
		return temp1.equals(temp2);
	}	
}
