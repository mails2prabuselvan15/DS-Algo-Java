package stackProblems;

import java.util.Stack;

public class DecodeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String s = "3[a]2[bc]";
		String s = "3[a2[c]]";
		String decode = decode(s);
		System.out.println("Final  output is "+ decode);
	}
	
	public static String decode(String s) {
		
	Stack<Character> stk = new Stack<Character>();
	String lastString="";
	String temp="";
	String tempStr="";
	String lastReverse="";
	String firstStr= "";
	Character peek;
	Character pop;
	for (int i=0; i<s.length(); i++) {
		char charAt = s.charAt(i);
		System.out.println("charAt is "+charAt);
		if(!Character.isDigit(charAt)) {
			stk.push(charAt);
		}
	}
	for (int i=s.length()-1; i>0; i-- ) {
		
		char charAt = s.charAt(i);
		
		if (Character.isDigit(charAt)) {
			int numericValue = Character.getNumericValue(charAt);
			 peek = stk.peek();
			 System.out.println("peek is "+peek);
			while (stk.peek()!=']') {
				 pop = stk.pop();
				 if(pop!='[') {
					 lastString+=pop;
				 }		
			}
			stk.pop();
			 lastReverse = reverse(lastString);
			System.out.println("Last String is "+lastString);
			while (stk.peek()!='[') {
				pop=stk.pop();
				System.out.println("popped va	lue is "+pop);
				if (pop!=']') {
					temp+=pop;
				}
			}
			stk.pop();
			for (int i1=0;i1<numericValue;i1++) {
				tempStr+=temp;
			}
			System.out.println("Temp String is "+tempStr);

			temp="";
		}
	}

	
	while(!stk.isEmpty()) {
		char pop2 = stk.pop();
		firstStr+= pop2;
	}
	String reverse0 = reverse(firstStr);
	System.out.println("Last String is "+ firstStr);
	String reverse = reverse(tempStr);
	System.out.println("Reverse is "+ reverse);
	return reverse0+reverse+lastReverse;
}

public static String reverse(String str) {
	
	String temp = "";
	for (int i=str.length()-1; i>=0 ; i-- ) {
		temp+=str.charAt(i);
	}
	return temp;
	
}
		
		

		
}
