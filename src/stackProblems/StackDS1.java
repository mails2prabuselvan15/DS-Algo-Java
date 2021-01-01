package stackProblems;

import java.util.Stack;

public class StackDS1 {

//	public StackDS1() {
		 Stack<Integer> mainstk = new Stack<Integer>();
		 Stack<Integer> auxStack= new Stack<Integer>();	
//	}

	public static void main(String[] args) {
		
		StackDS1 obj = new StackDS1();
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.push(40);
		obj.push(50);
		obj.push(60);
		obj.push(120);
		int min = obj.getMin();
		System.out.println("min value is "+min);
	}

	public  void push (int num) {
		if(mainstk.isEmpty() && auxStack.isEmpty()) {
			mainstk.push(num);
			auxStack.push(num);
			return;
		}
		mainstk.push(num);
		if (mainstk.peek()<= auxStack.peek()) {
			auxStack.push(num);
		}
	}
	
	public void pop() {
		if (mainstk.peek()== auxStack.peek()) {
			auxStack.pop();
		}
		mainstk.pop();
	}
	
	public int peek() {
		if (!mainstk.isEmpty()) {
			return mainstk.peek();
		}
		return -1;
	}
	
	public int getMin() {
		
		if (!auxStack.isEmpty()) {
			return auxStack.peek();
		}
		return -1;
	}
	

}
