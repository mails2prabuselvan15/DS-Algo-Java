package linkedListProblems;

public class MiddleNode{
	
	int data;
	MiddleNode next;
	
	public MiddleNode(int data) {
		this.data=data;
		this.next=null;
	}

	public static void main(String[] args) {
	
		MiddleNode Head=  new MiddleNode(1);
		MiddleNode temp1=  new MiddleNode(2);
		MiddleNode temp2=  new MiddleNode(3);
		MiddleNode temp3=  new MiddleNode(4);
//		MiddleNode temp4=  new MiddleNode(5);
		
		Head.next=temp1;
		temp1.next=temp2;
		temp2.next=temp3;
//		temp3.next=temp4;
		
//		To print the data
		
//		MiddleNode temp =Head;
//		while(temp!=null) {
//			System.out.println(temp.data);
//			temp=temp.next;
//			
//		}
		
//		To Print the Middle Node
		
		MiddleNode slowPtr=Head;
		MiddleNode fastPtr=Head;
		
		while(fastPtr!=null && fastPtr.next!=null) { // print the middle node
//			while(fastPtr.next!=null && fastPtr.next.next!=null) {
			
			slowPtr=slowPtr.next;
			fastPtr=fastPtr.next.next;
		}
		System.out.println(slowPtr.data);
		
	}

}
