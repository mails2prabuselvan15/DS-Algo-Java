package linkedListProblems;

public class RemoveNthNodefromEnd {

	int data;
	RemoveNthNodefromEnd next;
	
	public RemoveNthNodefromEnd(int data) {
		this.data=data;
		this.next=null;
	}

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RemoveNthNodefromEnd Head=  new RemoveNthNodefromEnd(1);
		RemoveNthNodefromEnd temp1=  new RemoveNthNodefromEnd(2);
//		RemoveNthNodefromEnd temp2=  new RemoveNthNodefromEnd(3);
//		RemoveNthNodefromEnd temp3=  new RemoveNthNodefromEnd(4);
//		RemoveNthNodefromEnd temp4=  new RemoveNthNodefromEnd(5);
		
		Head.next=temp1;
//		temp1.next=temp2;
//		temp2.next=temp3;
//		temp3.next=temp4;

		int n=2; // from the end
		
		RemoveNthNodefromEnd slowPtr=Head;
		RemoveNthNodefromEnd fastPtr=Head;
		
		for (int i=0; i <n-1;i ++) {
			fastPtr=fastPtr.next;
		}
		if (fastPtr==null && n==1) {
			Head=null;
			return ;
		} else if (fastPtr.next==null && n==1) {
			Head.next=null;
		} else if (fastPtr==null && n==2) {
			slowPtr.next=null;
			Head=fastPtr;
			return;
		}
		
		while (fastPtr!=null && fastPtr.next!=null) {
			fastPtr=fastPtr.next;
			slowPtr=slowPtr.next;
//			System.out.println("Slow Pointer is "+ slowPtr.data);
//			System.out.println("Fast Pointer is "+fastPtr.data);
		}
		System.out.println(slowPtr.data);
		slowPtr.next=fastPtr;
		
//		to print the linked list after removal of nth node
		
		RemoveNthNodefromEnd temp=Head;
		while (temp!=null )  {
			 System.out.println(temp.data);
			 temp=temp.next;
		}
	}

}
