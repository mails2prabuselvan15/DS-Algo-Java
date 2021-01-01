package stackProblems;

public class StackUsingLinkedList {

	int data;
	StackUsingLinkedList next;
	static int top=0;
	static StackUsingLinkedList topNode=null;
	
	StackUsingLinkedList(int data){
		this.data=data;
		this.next=null;
	}
	
	public static void main(String[] args) {
		push(10);
		push(20);
		push(30);
		push(40);
		
		display(topNode);
		
		int peak = peak();
		System.out.println("Peak Element from stack is "+peak);
		
		int pop = pop();
		System.out.println("Popped Element from stack is "+pop);
		
		System.out.println("****After Popping ****");
		display(topNode);
	}
	
//	Traversing O(n) --> Push Operation at the end
//	O(1) -- Push operation at the beginning
	
	public static void push(int element) {
		StackUsingLinkedList newNode= new StackUsingLinkedList(element);
		newNode.next=topNode;
		topNode=newNode;
	}
	
	public static int pop() {
		StackUsingLinkedList nextNode= topNode.next;
		if(topNode!=null) {
			int temp = topNode.data;
//			nextNode.next=null;
			topNode=nextNode;
			return temp;
		}
		return -1;
	}
	
	public static int peak() {
		if(topNode!=null) {
			return topNode.data;
		}
		return -1;
	}
	
	public static void display(StackUsingLinkedList topNode) {
		StackUsingLinkedList temp =topNode;
	while (temp!=null) {
		System.out.println(temp.data);
		temp=temp.next;
	}
}
	
	
//	
}
