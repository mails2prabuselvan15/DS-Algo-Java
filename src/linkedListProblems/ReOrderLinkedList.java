package linkedListProblems;

public class ReOrderLinkedList {
	
	int data;
	ReOrderLinkedList next;
	
	ReOrderLinkedList(int data){
		this.data=data;
		this.next=null;
	}
	
	public static void main(String[] args) {
		ReOrderLinkedList head= new ReOrderLinkedList(1);
		ReOrderLinkedList temp1= new ReOrderLinkedList(2);
		ReOrderLinkedList temp2= new ReOrderLinkedList(3);
		ReOrderLinkedList temp3= new ReOrderLinkedList(4);
		ReOrderLinkedList temp4= new ReOrderLinkedList(5);
//		ReOrderLinkedList temp5= new ReOrderLinkedList(6);
		

		head.next=temp1;
		temp1.next=temp2;
		temp2.next=temp3;
		temp3.next=temp4;
//		temp4.next=temp5;

//		Segregating even linked list
		ReOrderLinkedList temp=head;
		ReOrderLinkedList evenHead=head.next;
		ReOrderLinkedList evenTail=head.next;
		ReOrderLinkedList oddHead=head.next.next;
		ReOrderLinkedList oddTail=head.next.next;
		
		ReOrderLinkedList lastNode=null;
		while (temp!=null) {
//			System.out.println(temp.data);
			lastNode=temp;
			temp=temp.next;
		}
		System.out.println(lastNode.data);
		
		while ((evenTail!=null && evenTail.next!=null )  ) {
			evenTail.next=(evenTail.next!=null)? (evenTail.next.next):null;
			System.out.println(evenTail.data);
			evenTail=evenTail.next;
		}

		while(oddTail.next!=null && oddTail.next!=null) {
			oddTail.next=(oddTail.next!=null)?(oddTail.next.next):null;
			System.out.println(oddTail.data);
			oddTail=oddTail.next;
		}
		temp=evenHead;
		ReOrderLinkedList evenlastNode=null;
		while(temp!=null) {
			evenlastNode=temp;
			temp=temp.next;
		}
		
		ReOrderLinkedList newHead= head;
		newHead.next=lastNode;
		lastNode.next=evenHead;
		
		ReOrderLinkedList test=newHead;
		while (test!=null) {
			System.out.println(" After Reordering "+test.data);
			test=test.next;
		}
		test.next=oddHead;
		
//		evenlastNode.next=oddHead;
		
		
	
	
	}

	
}
