package linkedListProblems;

public class DeleteDuplicateNodesinLL {
	
	int val;
	DeleteDuplicateNodesinLL next;
	
	DeleteDuplicateNodesinLL(int val) {
		this.val=val;
		this.next=null;
	}
	

	public static void main(String[] args) {

		DeleteDuplicateNodesinLL head= new DeleteDuplicateNodesinLL(1);
		DeleteDuplicateNodesinLL temp1= new DeleteDuplicateNodesinLL(2);
		DeleteDuplicateNodesinLL temp2= new DeleteDuplicateNodesinLL(3);
		DeleteDuplicateNodesinLL temp3= new DeleteDuplicateNodesinLL(3);
		DeleteDuplicateNodesinLL temp4= new DeleteDuplicateNodesinLL(3);
		DeleteDuplicateNodesinLL temp5= new DeleteDuplicateNodesinLL(4);
		DeleteDuplicateNodesinLL temp6= new DeleteDuplicateNodesinLL(5);

		head.next=temp1;
		temp1.next=temp2;
		temp2.next=temp3;
		temp3.next=temp4;
		temp4.next=temp5;
		temp5.next=temp6;
		
		DeleteDuplicateNodesinLL slowPtr= head;
		DeleteDuplicateNodesinLL fastPtr=head.next;
		DeleteDuplicateNodesinLL prev=head;
		DeleteDuplicateNodesinLL next=head.next;
		DeleteDuplicateNodesinLL temp=head;
		boolean flag=false;
		
		while(fastPtr!=null) {
			int sec =fastPtr.val;
			int first=slowPtr.val;
			
			System.out.println("first value "+ first);
			System.out.println("second value "+sec);
			if (sec==first) {
				flag=true;
			} else if(sec!=first && flag==false) {
				prev=slowPtr;
				
			} else if(sec!=first && flag==true ) {
				next=fastPtr;
				prev.next=next;
				flag=false;
			}
			slowPtr=slowPtr.next;
			fastPtr=fastPtr.next;
			
		}
	}
}
