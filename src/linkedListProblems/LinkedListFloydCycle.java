package linkedListProblems;

public class LinkedListFloydCycle {

	int data;
	LinkedListFloydCycle next;
	
	LinkedListFloydCycle(int data) {
		this.data=data;
		this.next=null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

				
		LinkedListCycle2 head= new LinkedListCycle2(1);
//		LinkedListCycle2 temp1= new LinkedListCycle2(2);
//		LinkedListCycle2 temp2= new LinkedListCycle2(3);
//		LinkedListCycle2 temp3= new LinkedListCycle2(4);
		
//		head.next=temp1;
//		temp1.next=temp2;
//		temp2.next=temp3;
//		temp3.next=temp1;
		
		boolean floydCycle = floydCycle(null);
		System.out.println("Floyd cycle "+ floydCycle);

	}
	
	
	public static boolean floydCycle(LinkedListCycle2 head) {
	
		LinkedListCycle2 slow=head;
		LinkedListCycle2 fast=head;
		
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) return true;
		}
		
		return false;
		
	}
		
	

}
