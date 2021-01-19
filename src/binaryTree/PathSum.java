package binaryTree;

public class PathSum {
	
	int val;
	PathSum left;
	PathSum right;
	 int data = 0;
	
	PathSum(int val) {
		this.val=val;
	}

	public static void main(String[] args) {
		
		PathSum five= new PathSum(5);
		PathSum four= new PathSum(4);
		PathSum eight= new PathSum(8);
		PathSum eleven= new PathSum(11);
		PathSum thirteen= new PathSum(13);
		PathSum four2= new PathSum(4);
		PathSum seven= new PathSum(7);
		PathSum two= new PathSum(2);
		PathSum one= new PathSum(1);
		
		
		five.left=four;
		five.right=eight;
		four.left=eleven;
		eleven.left=seven;
		eleven.right=two;
		eight.left=thirteen;
		eight.right=four2;
		four2.right=one;
		
	sumpath(five, 22);
		

	}
	
	public static void sumpath(PathSum root, int sum) {
	
		
	  
	  
	}

}
