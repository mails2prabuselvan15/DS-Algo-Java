package linkedListProblems;

public class CloneLinkedListwithRandomBigOofN {
	
	int data;
	CloneLinkedListwithRandomBigOofN next;
	CloneLinkedListwithRandomBigOofN random;
	
	
	CloneLinkedListwithRandomBigOofN(int data) {
		this.data=data;
		this.next=null;
		this.random=null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CloneLinkedListwithRandomBigOofN head= new CloneLinkedListwithRandomBigOofN(10);
		CloneLinkedListwithRandomBigOofN temp1= new CloneLinkedListwithRandomBigOofN(20);
		CloneLinkedListwithRandomBigOofN temp2= new CloneLinkedListwithRandomBigOofN(30);
		CloneLinkedListwithRandomBigOofN temp3= new CloneLinkedListwithRandomBigOofN(40);
		CloneLinkedListwithRandomBigOofN temp4= new CloneLinkedListwithRandomBigOofN(50);
		
		head.next=temp1;
		temp1.next=temp2;
		temp2.next=temp3;
		temp3.next=temp4;
		
		head.random=temp2;
		temp1.random=temp3;
		temp2.random=head;
		temp3.random=temp2;
		temp4.random=temp3;
		
		
		CloneLinkedListwithRandomBigOofN temp=head;
		CloneLinkedListwithRandomBigOofN newNode=null;
		CloneLinkedListwithRandomBigOofN tempNode=null;
		while (temp!=null) {
			 newNode=new CloneLinkedListwithRandomBigOofN(temp.data);
			 tempNode=temp.next;
			 temp.next=newNode;
			 newNode.next=tempNode;
			 temp=temp.next.next;
		}
		
		temp=head;
		while (temp!=null) {
//			CloneLinkedListwithRandomBigOofN random = temp.random;
			temp.next.random=temp.random.next;
			temp=temp.next.next;
		}
		
		CloneLinkedListwithRandomBigOofN orgHead = head;
		CloneLinkedListwithRandomBigOofN orgTail=head;
		
		CloneLinkedListwithRandomBigOofN clonedHead=head.next;
		CloneLinkedListwithRandomBigOofN clonedTail=head.next;
		
		
		while(orgTail!=null && clonedTail!=null) {
			orgTail.next=(orgTail.next!=null ? orgTail.next.next: null);
			clonedTail.next=(clonedTail.next!=null ? clonedTail.next.next:null);
			
			orgTail=orgTail.next;
			clonedTail=clonedTail.next;
		}
		
		
		
		clonedHead=head;
		while(clonedHead!=null) {
			System.out.println(clonedHead.data);
			clonedHead=clonedHead.next;
		}
		
		orgHead=head;
		while(orgHead!=null) {
			System.out.println(orgHead.data);
			orgHead=orgHead.next;
		}
		
	}

}
