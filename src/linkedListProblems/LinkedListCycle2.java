package linkedListProblems;

public class LinkedListCycle2 {
	int data;
	LinkedListCycle2 next;
	boolean visited;
	
	LinkedListCycle2(int data){
		this.data=data;
		this.next=null;
		this.visited=false;
	}

	public static void main(String[] args) {
		
		LinkedListCycle2 head= new LinkedListCycle2(1);
		LinkedListCycle2 temp1= new LinkedListCycle2(2);
		LinkedListCycle2 temp2= new LinkedListCycle2(3);
		LinkedListCycle2 temp3= new LinkedListCycle2(4);
		
		head.next=temp1;
		temp1.next=temp2;
		temp2.next=temp3;
//		temp3.next=temp1;
		
		boolean visited2 = isVisited(head);
		System.out.println("Value is "+visited2);
		
	
	}
	
	public static boolean isVisited(LinkedListCycle2 head) {
		LinkedListCycle2 temp=head;
		while(temp!=null) {
			if (temp.visited==true)  {
				return true;
			} else {
				temp.visited=true;
			}
			temp=temp.next;
		}
		return false;
	}

}
