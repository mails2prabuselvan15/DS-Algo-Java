package linkedListProblems;

public class GreaterNodeinLL {
	int data;
	GreaterNodeinLL next;
	
	GreaterNodeinLL(int data){
		this.data=data;
		this.next=null;
	}

	public static void main(String[] args) {
		
		GreaterNodeinLL head= new GreaterNodeinLL(2);
		GreaterNodeinLL temp1= new GreaterNodeinLL(1);
		GreaterNodeinLL temp2= new GreaterNodeinLL(5);
//		GreaterNodeinLL temp3= new GreaterNodeinLL(3);
//		GreaterNodeinLL temp4= new GreaterNodeinLL(5);
//		GreaterNodeinLL temp5= new GreaterNodeinLL(2);
//		GreaterNodeinLL temp6= new GreaterNodeinLL(5);
//		GreaterNodeinLL temp7= new GreaterNodeinLL(1);
		
		head.next=temp1;
		temp1.next=temp2;
//		temp2.next=temp3;
//		temp3.next=temp4;
//		temp4.next=temp5;
//		temp5.next=temp6;
//		temp6.next=temp7;
		
		GreaterNodeinLL outer =head;
		GreaterNodeinLL inner=head.next;
		
		
		int count=0;
		while (outer!=null) {
			count++;
			outer=outer.next;	
		}
		
		System.out.println("Outer count is "+count);
		
		int Array[]=new int[count];
		int i=0;
		outer=head;
		inner=head.next;
		while (outer.next!=null) {
			System.out.println("Outer --> "+outer.data);
			boolean flag=false;
			int max=outer.data;
			while(inner!=null) {
				System.out.println("Inner -->" +inner.data);
				if (inner.data > max) {
					max=inner.data;
					flag=true;
					break;
				}
				inner=inner.next;
			}
			
			if (flag==false) {
				Array[i]=0;
			} else {
				Array[i]=max;
			}
			System.out.println("******"+outer.data);
			outer=outer.next;
			inner=outer.next;
			i++;
		}
		
//		for (int k=0;k<Array.length; k++) {
//			System.out.println(Array[k]);
//		}
		
		

	}

}
