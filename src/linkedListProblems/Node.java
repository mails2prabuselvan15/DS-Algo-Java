package linkedListProblems;

public class Node {

	int data;
	Node  next;
	
	Node(int data) {
		this.data=data;
		this.next=null;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=3;
		Node Head = new Node(1);
		Node temp1=  new Node(2);
		Node temp2=  new Node(3);
		Node temp3=  new Node(4);
		Node temp4=  new Node(5);
		Node temp5=  new Node(6);
		Node temp6=  new Node(7);
//		Node temp7=  new Node(8);
//		Node temp8=  new Node(9);
//		Node temp9=  new Node(10);
//		Node temp10=  new Node(11);
		
		int val=6;
		
		
		Head.next=temp1;
		temp1.next=temp2;
		temp2.next=temp3;
		temp3.next=temp4;
		temp4.next=temp5;
		temp5.next=temp6;
//		temp6.next=temp7;
//		temp7.next=temp8;
//		temp8.next=temp9;
//		temp9.next=temp10;
//		
		
//		Node temp=Head;
//		int count=0;
//		while (temp!=null) {
//			count++;
//			temp=temp.next;
//		}
//		System.out.println(count);
//		
//		int len = count-k+1;
//		temp=Head;
//		int count1=0;
//		while(temp!=null) {
//			count1++;
//			if (count1==len) {
//				System.out.println(temp.data);
//			}
//			temp=temp.next;
//		}
		
		
//		Node temp=Head;
//		Node slowptr=Head;
//		Node fastptr = null;
//		int count=0;
//		while (temp!=null) {
//			count++;
//			temp=temp.next;
//			if (count==k) {
//				fastptr=temp;
//				break;
//			}
//		}
//		
//		if (fastptr==null) {
//			return;
//		}
//		if (k<=count) {
//			while(fastptr.next!=null) {
//				slowptr=slowptr.next;
//				fastptr=fastptr.next;
//			}
//			System.out.println(slowptr.data);
//		} else {
//			return;
//		}
		 
//		if (Head==null) return;
//		
//		Node slowPtr= Head;
//		Node fastPtr=Head;
//	
////		while(fastPtr!=null &&  fastPtr.next!=null) { middle element 
//		
//		while(fastPtr.next!=null && fastPtr.next.next!=null) { // middle element +  1
//			slowPtr=slowPtr.next;
//			fastPtr=fastPtr.next.next;
//		}
//		System.out.println(slowPtr.data);
		
//		Node temp =Head;	
//        
//        while (temp.next!=null) {
//            int num=temp.next.data;
//            if (num==val) {
//            	temp.next=temp.next.next;
//            }else {
//            	temp=temp.next;
//            }
//        }
//        
//        temp=Head;
//        while(temp!=null) {
//        	System.out.println(temp.data);
//        	temp=temp.next;
//        }
		
		
		Node temp=Head;
//		int count=0;
		while(temp.next!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		
		}
		
	}

}
