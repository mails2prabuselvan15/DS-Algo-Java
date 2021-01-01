package stackProblems;

public class StackusingArray {
	
	static int len=5;
	static int stack[] = new int [len];
	static int top=-1;
	public static void main(String[] args) {
		push(10);
		push(20);
		push(30);
		push(40);
		push(50);
		push(60); // cant be inserted
		int deletedelement = pop();
		System.out.println("Deleted Element is "+deletedelement);
		int peak = peak();
		System.out.println("Peak Element is "+peak);
		display();
	}
	
	public static void push(int element) {
		if (top==len-1) {
			System.out.println("Stack is Overflow");
			return;
		} else {
			top++;
			stack[top]=element;
			System.out.println("Inserted element  "+ element);
		}
	}

	public static int pop() {
		 int temp=-1;
		if (top==-1) {
			System.out.println("Stack is underflow");
		}else {
			temp=stack[top];
			top--;
		}
		return temp;
	}
	
//	peak --> find the top element from the stack
	public static int peak() {
		int temp =-1;
		if(top!=-1) {
			temp = stack[top]; 
			return temp;
		}
		return -1;
	}
	
//	to display we should delete all the elements from the stack
	
	public static void display() {
		while (top!=-1) {
			System.out.println(stack[top]); 
			top--;
		}
	}
}
