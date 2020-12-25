package linkedListProblems;

public class RotateKPlacesFromRight {
	
	int data;
	RotateKPlacesFromRight next;
	
	RotateKPlacesFromRight(int data){
		this.data=data;
		this.next=null;
	}

	public static void main(String[] args) {
	
		RotateKPlacesFromRight head= new RotateKPlacesFromRight(1);
		RotateKPlacesFromRight temp1= new RotateKPlacesFromRight(2);
//		RotateKPlacesFromRight temp2= new RotateKPlacesFromRight(2);
//		RotateKPlacesFromRight temp3= new RotateKPlacesFromRight(4);
//		RotateKPlacesFromRight temp4= new RotateKPlacesFromRight(5);
		
		head.next=temp1;
//		temp1.next=temp2;
//		temp2.next=temp3;
//		temp3.next=temp4;
		
		int k=0;
		RotateKPlacesFromRight rotateKtimes=null;
	
		rotateKtimes = rotateKtimes(head,k );
		while (rotateKtimes!=null) {
			System.out.println(rotateKtimes.data);
			rotateKtimes=rotateKtimes.next;
		}		
	}
	
	
 public static RotateKPlacesFromRight rotateKtimes(RotateKPlacesFromRight head, int k) {
	 
	 if(( head==null || head.next==null) && k==0) {
         return head;
     } 
	 
	 RotateKPlacesFromRight newHead=null;
	 RotateKPlacesFromRight firstNode =head;
	 RotateKPlacesFromRight temp=head;
	 RotateKPlacesFromRight prev=null;
	for (int i=1; i<=k; i++)  {
		while (temp.next!=null) {
			prev=temp;
			temp=temp.next;
		}
	 System.out.println("temp "+temp.data);
	 System.out.println("prev "+prev.data);
		temp.next=firstNode;
		prev.next=null;	
		newHead=temp;
		firstNode=newHead;
//	 while(newHead!=null) {
//		 System.out.println(newHead.data);
//		 newHead=newHead.next;
//	 }	
	}
	return newHead;
 }
	
}
