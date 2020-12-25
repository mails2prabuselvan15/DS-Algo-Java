package linkedListProblems;

import java.util.HashMap;
import java.util.HashSet;

public class LinkedListCycle {
	
	int val;
	LinkedListCycle next;
	
	LinkedListCycle(int val) {
		this.val=val;
		this.next=null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedListCycle head= new LinkedListCycle(1);
		LinkedListCycle temp1= new LinkedListCycle(2);
		LinkedListCycle temp2= new LinkedListCycle(3);
		LinkedListCycle temp3= new LinkedListCycle(4);

			head.next =temp1;
			temp1.next=temp2;
			temp2.next=temp3;
			temp3.next=temp1;
			boolean findLoop = findLoop2(head);
			System.out.println("Find Loop "+ findLoop);
			
//		HashMap<Integer, Integer> hmap =  new HashMap<Integer, Integer>();
				
	}
	
//	public static  boolean findLoop( LinkedListCycle head) {
//		if (head==null) return false;
//		LinkedListCycle slow=head;
//		LinkedListCycle fast=head.next;
//		
//		while (slow!=null && fast!=null && fast.next!=null) {
//			if(slow==fast) {
//				return true;
//			}
//			slow=slow.next;
//			fast=fast.next.next;
//		}
//	return false;
//	}
	
	public static boolean findLoop1(LinkedListCycle head) {
		if (head==null) return false;
		
		LinkedListCycle curr=head;
		LinkedListCycle temp = null;
		
		while (curr!=null) {
			LinkedListCycle next=curr.next;
			
			if (curr.next==temp) {
				return true;
			}
			curr.next=temp;
			curr=next;
			
			curr=curr.next;
		}
		return false;
	}
	
	
	public static boolean findLoop2(LinkedListCycle head) {
		
		if (head==null ) return false;
		LinkedListCycle curr=head;
		HashSet<LinkedListCycle> hmap = new HashSet<LinkedListCycle>();
		
		while(curr!=null) {
			if (!hmap.contains(curr.next)) {
				hmap.add(curr.next);
			} else {
				return true;
			}
			curr=curr.next;
		}
		return false;
		
	}

}
