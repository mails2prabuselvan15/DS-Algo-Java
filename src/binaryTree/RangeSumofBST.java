package binaryTree;

public class RangeSumofBST {
	
	int data;
	RangeSumofBST left;
	RangeSumofBST right;
	static int value=0;
	
	
	RangeSumofBST(int data) {
		this.data=data;
	}


	public static void main(String[] args) {
		
		RangeSumofBST ten= new RangeSumofBST(10);
		RangeSumofBST five= new RangeSumofBST(5);
		RangeSumofBST fifteen= new RangeSumofBST(15);
		RangeSumofBST three= new RangeSumofBST(3);
		RangeSumofBST seven= new RangeSumofBST(7);
		RangeSumofBST eighteen= new RangeSumofBST(18);
		
		ten.left=five;
		ten.right=fifteen;
		five.left=three;
		five.right=seven;
		fifteen.right=eighteen;	

		int low = 7;
		
		int high =15;
		
		int rangeofsum = rangeofsum(ten, low,  high);
		
		System.out.println("Range of sum is "+rangeofsum);
	}
	
	public static int rangeofsum(RangeSumofBST root, int low, int high ) {
		
		
		if(root==null) return 0;
		
		if(root.data>=low  && root.data<= high) {
			 value+=root.data;
		}
		
		int left = rangeofsum(root.left, low, high);
		
		int right =rangeofsum(root.right, low, high);
		
		return value;
		
		
	}

}
