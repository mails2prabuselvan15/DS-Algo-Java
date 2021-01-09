package warmupProblems;

import java.util.Stack;

public class WordMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ops[] = {"1", "5", "DUP", "3", "-"};
		solve(ops);
		
	}
	
	public static int solve(String ops[]) {
		Stack<Integer> stk = new Stack<Integer>();
		for (int i=0; i<ops.length; i++) {
			
			String string = ops[i];
			
			String num ="10";
			
		      StringBuilder sb = new StringBuilder("prabu");
//		       sb.reverse();
		       
		       System.out.println(sb.reverse());
//			Integer valueOf = Integer.parseInt(string);
//			
//			System.out.println(valueOf);
			
//			if (Character.isDigit(charAt)) {
//				int num= charAt;
//				stk.push(num);
//			} 
		}
		return 0;
	}

}
