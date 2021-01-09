package stackProblems;

import java.util.Stack;

public class RemoveAdjacentDuplicatesInString {

	public static void main(String[] args) {
		String s = "abbaca";
		StringBuilder removeDup = removeDup1(s);
		System.out.println("String is "+removeDup);
	}
	
	public static StringBuilder removeDup1(String s) {
		Stack<Character> stk = new Stack<Character>();
		for (char ch :  s.toCharArray()) {
			System.out.println("ch is "+ ch);
			if(!stk.isEmpty() && ch == stk.peek()) {
				stk.pop();
			}else {
				stk.push(ch);
			}
		}
		StringBuilder sb = new StringBuilder();
		while(!stk.isEmpty()) {
			sb.append(stk.pop());
		}
		return sb.reverse();
	}
	
//	Solution 2 : 
//	public static String removeDup2( String s) {
//		
//		
//		int len =s.length()-1;
//		String res= "";
//		
//		for (int i=0; i< len; i++) {
//			System.out.println("i value is "+ i);
//			if(s.charAt(i)!=s.charAt(i+1)) {
//				res+= s.charAt(i);
//					i++;
//			}
//			System.out.println("i value is "+ i);
//			if(i!=len && (s.charAt(i)== s.charAt(i+1))) {
//				while (i!=len && (s.charAt(i) == s.charAt(i+1))) {
//					i++;
//				}
//			}
//			System.out.println("i value is "+ i);
//		}
//		
//		return res;
//	}
	
	
	
//	public static String removeDup(String s) {
//		Stack<Character> stk = new Stack<Character>();
//		String str="";
//		StringBuilder temp= new StringBuilder();
//		for (int i=s.length()-1;i>=0; i--) {
//			stk.push(s.charAt(i));
//		}
//		
//		System.out.println(s.length());
//		int lastlen= s.length()-1;
//		for (int i=1; i<s.length(); i++) {
//			char pop = stk.pop();
//			char ch1 =s.charAt(i);
//			System.out.println(i);
//			if (ch1!=pop && i!=lastlen) {
//				str+=pop;
//			} else if(ch1!=pop && i==lastlen ) {
//				str+=pop;
//				str+=ch1;
//			}else {
//				stk.pop();
//				i++;
//			}
//		}
//		
//		return str;
//	}
}
