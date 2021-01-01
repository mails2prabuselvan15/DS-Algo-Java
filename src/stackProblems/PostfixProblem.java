package stackProblems;

import java.util.Stack;

public class PostfixProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str[] = {"2", "1", "+", "3", "*"};
		
		postfix(str);
	}
	
	public static int postfix(String str[]) {
		Stack<Integer> stk= new Stack<Integer>();
		String  temp2 = "" ;
		String temp="";
		int res=0;
		int j=0;
		for (int i=0; i<str.length;i++) {
			temp=str[i];
			if ((temp!="+") && (temp!="*")){
				Integer val = Integer.valueOf(str[i]);
				System.out.println(val);
				stk.push(val);
			} else {
				temp = str[i];
				char ch = temp.charAt(j);
				System.out.println("Temp value is  "+ch);
				j++;

				while(!stk.isEmpty()) {
					int del = stk.pop();
					String stkval = String.valueOf(del);
					System.out.println("Popped element is "+ del);
					temp2+=del +ch;					
					System.out.println("Temp2 value is "+temp2);
				}
				
				
			}
		}
		return 0;
		
	}

}
