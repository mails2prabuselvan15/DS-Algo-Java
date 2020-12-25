package linkedListProblems;

public class SwapNodes {
	int val;
	SwapNodes next;
	
	SwapNodes(int val) {
		this.val=val;
		this.next=null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SwapNodes head= new SwapNodes(1);
		SwapNodes temp1= new SwapNodes(2);
		SwapNodes temp2= new SwapNodes(3);
		SwapNodes temp3= new SwapNodes(4);
//		SwapNodes temp4= new SwapNodes(3);
//		SwapNodes temp5= new SwapNodes(4);
//		SwapNodes temp6= new SwapNodes(5);

		head.next=temp1;
		temp1.next=temp2;
		temp2.next=temp3;
//		temp3.next=temp4;
//		temp4.next=temp5;
//		temp5.next=temp6;
		
		SwapNodes curr=head;
		SwapNodes second=head.next;
		SwapNodes temp=null;
		
		while (second!=null) {
			temp = second;
			second.next=curr;
			if (curr==head) {
				head=second;
			} else {
				
			}
			
			
			curr=curr.next.next;
			second=second.next.next;
		}
		

	}

}
