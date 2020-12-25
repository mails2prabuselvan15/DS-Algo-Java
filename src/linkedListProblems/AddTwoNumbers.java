package linkedListProblems;

public class AddTwoNumbers {
	
	int data;
	AddTwoNumbers next;

	AddTwoNumbers(int data) {
		this.data=data;
		this.next=null;
	}

	public static void main(String[] args) {
		
		AddTwoNumbers head1 = new AddTwoNumbers(7);
		AddTwoNumbers temp1 = new AddTwoNumbers(2);
		AddTwoNumbers temp2 = new AddTwoNumbers(4);
		AddTwoNumbers temp3 = new AddTwoNumbers(3);
		
		head1.next=temp1;
		temp1.next=temp2;
		temp2.next=temp3;
		
		
		AddTwoNumbers head2 = new AddTwoNumbers(5);
		AddTwoNumbers temp4 = new AddTwoNumbers(6);
		AddTwoNumbers temp5 = new AddTwoNumbers(4);
		
		head2.next=temp4;
		temp4.next=temp5;
		
		AddTwoNumbers reverse1 = reverse(head1);
		AddTwoNumbers reverse2 = reverse(head2);
		AddTwoNumbers finalList = addTwoLinkedList(reverse1, reverse2);
		AddTwoNumbers temp=finalList;
		while (temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;	
		}
	}

	
	public static AddTwoNumbers addTwoLinkedList(AddTwoNumbers reverse1, AddTwoNumbers reverse2) {
		AddTwoNumbers temp1=reverse1;
		AddTwoNumbers temp2=reverse2;
		AddTwoNumbers newNode= null;
		AddTwoNumbers head=null;
		AddTwoNumbers prev=null;
		int carry=0;
		int data=0;
		while (temp1!=null || temp2!=null) {
			if (temp1==null) {
				 data= 0 +temp2.data;
			} else if(temp2==null) {
				data= temp1.data +0;
			} else {
			 data=temp1.data + temp2.data;
			}	
			int val = data / 10;
			if (val== 0) {
				newNode = new AddTwoNumbers(data+carry);
				carry=0;
				 
			} else {
				val = data % 10;
				newNode = new AddTwoNumbers(val);
				carry=data/10;
			}
			
			newNode.next=prev;
			prev=newNode;
			if (temp1!=null) temp1=temp1.next;
			if (temp2!=null) temp2=temp2.next;
		}
		
		head= newNode;
		return head;
	}
	
	
	public static AddTwoNumbers reverse(AddTwoNumbers head) {		
		AddTwoNumbers curr=head;
		AddTwoNumbers prev=null;
		
		while(curr!=null) {
			AddTwoNumbers next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		return prev;
	}
}
