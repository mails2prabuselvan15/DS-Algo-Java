package linkedListProblems;

public class ReverseLinkedList {
	
	int data;
	ReverseLinkedList next;
	
	ReverseLinkedList(int data) {
		this.data=data;
		this.next=null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReverseLinkedList head= new ReverseLinkedList(10);
		ReverseLinkedList temp1= new ReverseLinkedList(20);
		ReverseLinkedList temp2= new ReverseLinkedList(30);
		ReverseLinkedList temp3= new ReverseLinkedList(40);
		ReverseLinkedList temp4= new ReverseLinkedList(50);
		
		head.next=temp1;
		temp1.next=temp2;
		temp2.next=temp3;
		temp3.next=temp4;
		
		ReverseLinkedList curr=head;
		ReverseLinkedList prev=null;
		while (curr!=null) {
			ReverseLinkedList next= curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		
//		printing the node in reverse order
//      Previous will be the current node		
		
		while (prev!=null) {
			System.out.println(prev.data);
			prev=prev.next;
		}
		
	}

}
