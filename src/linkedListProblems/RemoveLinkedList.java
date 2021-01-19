package linkedListProblems;

public class RemoveLinkedList {

	int val;
	RemoveLinkedList next;
	
	RemoveLinkedList(int val ) {
		this.val=val;
		this.next=null;
	}
	public static void main(String[] args) {
		
		RemoveLinkedList one = new RemoveLinkedList(1);
		RemoveLinkedList two = new RemoveLinkedList(2);
		RemoveLinkedList three = new RemoveLinkedList(3);
		RemoveLinkedList four = new RemoveLinkedList(4);
		RemoveLinkedList five = new RemoveLinkedList(5);
		RemoveLinkedList six = new RemoveLinkedList(6);
		
		one.next=two;
		two.next=six;
		six.next=three;
		three.next=four;
		four.next=five;
		five.next=six;
		
		int val=6;
		RemoveLinkedList removeElement = removeElement(one , val);
		
		RemoveLinkedList temp=removeElement;
		
		while (temp!=null) {
			System.out.println(temp.val);
			temp=temp.next;
		}

	}

	public static RemoveLinkedList removeElement(RemoveLinkedList one, int val) {
		RemoveLinkedList temp= one;
		while (temp!=null) {
			System.out.println("temp.val --> "+ temp.val);
			if(temp.next.val==val) {
				temp.next= temp.next.next;
			}
			temp=temp.next;
		}
	return one;
	}
}
