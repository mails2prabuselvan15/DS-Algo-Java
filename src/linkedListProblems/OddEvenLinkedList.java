package linkedListProblems;

public class OddEvenLinkedList {
	
	int data;
	OddEvenLinkedList next;
	
	OddEvenLinkedList(int data) {
		this.data=data;
		this.next=null;
	}

	public static void main(String[] args) {
		
		OddEvenLinkedList head= new OddEvenLinkedList(1);
		OddEvenLinkedList temp1= new OddEvenLinkedList(2);
		OddEvenLinkedList temp2= new OddEvenLinkedList(3);
		OddEvenLinkedList temp3= new OddEvenLinkedList(4);
		OddEvenLinkedList temp4= new OddEvenLinkedList(5);
		
		head.next=temp1;
		temp1.next=temp2;
		temp2.next=temp3;
		temp3.next=temp4;
		OddEvenLinkedList oddAndEven = oddAndEven(head);
	}
	
	public static OddEvenLinkedList oddAndEven(OddEvenLinkedList head) {
		
		if (head==null) {
			return head;
		}
		
		OddEvenLinkedList oddHead = head; 
		OddEvenLinkedList oddTail = head;
		OddEvenLinkedList evenHead = head.next;
		OddEvenLinkedList evenTail =head.next;
		
		
	
		
		while (oddTail!=null &&  evenTail!=null) {
			oddTail.next= (oddTail.next!=null)?(oddTail.next.next):null;
			evenTail.next=(evenTail.next!=null)?(evenTail.next.next):null;
			oddTail= oddTail.next;
			evenTail=evenTail.next;	
		}
		OddEvenLinkedList temp1odd=oddHead;
		OddEvenLinkedList prev=null;
		
		while(temp1odd!=null) {
			prev=temp1odd;
			temp1odd=temp1odd.next;
		}
		prev.next=evenHead;
		
		temp1odd=oddHead;
		
		while(temp1odd!=null) {
			System.out.println(temp1odd.data);
			temp1odd=temp1odd.next;
		}

		return temp1odd;
		
	}

}
