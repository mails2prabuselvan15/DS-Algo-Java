package linkedListProblems;

import java.util.HashMap;import java.util.Random;

public class CloneLinkedListWithRandom {

	int data;
	CloneLinkedListWithRandom next;
	CloneLinkedListWithRandom random;
	
	CloneLinkedListWithRandom(int data) {
		this.data=data;
		this.next=null;
		this.random=null;
	}
	
	public static void main(String[] args) {
		
		CloneLinkedListWithRandom Head= new CloneLinkedListWithRandom(10);
		CloneLinkedListWithRandom temp1= new CloneLinkedListWithRandom(20);
		CloneLinkedListWithRandom temp2= new CloneLinkedListWithRandom(30);
		CloneLinkedListWithRandom temp3= new CloneLinkedListWithRandom(40);
		CloneLinkedListWithRandom temp4= new CloneLinkedListWithRandom(50);
		
		Head.next=temp1;
		temp1.next=temp2;
		temp2.next=temp3;
		temp3.next=temp4;
		
		Head.random=temp2;
		temp1.random=temp3;
		temp2.random=Head;
		temp3.random=temp2;
		temp4.random=temp3;
		
//		 new clone
		CloneLinkedListWithRandom temp;
		CloneLinkedListWithRandom Cloned = null;
		
		HashMap<CloneLinkedListWithRandom,CloneLinkedListWithRandom> hmap = new HashMap<CloneLinkedListWithRandom,CloneLinkedListWithRandom>();
	
		temp=Head;
		while (temp!=null) {
			hmap.put(temp, new CloneLinkedListWithRandom(temp.data));
			temp=temp.next;
		}
		
		temp=Head;
		while(temp!=null) {
			 Cloned= hmap.get(temp);
			System.out.println(temp.data +  "---"+ temp.next);
			Cloned.next=hmap.get(temp.next);
			Cloned.random=hmap.get(temp.random);
			System.out.println("orginal list random address "+ temp.random);
			System.out.println("Cloned List random address "+ Cloned.random );
			temp=temp.next;
		}
//		Printing the Original node random
		temp=Head;
		while(temp!=null) {
			System.out.println("Original node address "+ temp.random);
			temp=temp.next;
		}
//		printing the new Node Random
		temp= Cloned;
		while(temp!=null) {
			System.out.println("New Node Address"+ temp.random);
			temp=temp.next;
		}
		
	}

}
