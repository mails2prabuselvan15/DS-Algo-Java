package binaryTree;

public class SumTree {

	int data;
	SumTree left;
	SumTree right;
	
	SumTree(int data) {
		this.data=data;
		this.left=null;
		this.right= null;
	}
	
	public static void main(String[] args) {
		
		SumTree one = new SumTree(1);
		SumTree two = new SumTree(2);
		SumTree three = new SumTree(3);
		SumTree four = new SumTree(4);
		SumTree five = new SumTree(5);
		SumTree six = new SumTree(6);
		SumTree seven = new SumTree(7);
		SumTree eight = new SumTree(8);
		SumTree nine = new SumTree(9);
		
		
		one.left=two;
		one.right=three;
		two.left=four;
		two.right=five;
		three.left=six;
		three.right=seven;
		seven.right=nine;
		
		int treeCount = treeCount(one);
		System.out.println("treeCount is "+treeCount);
		
	}
	
//	public static int treeCount (SumTree root) {
//		if (root==null) return 0;
//		int left= treeCount(root.left);
//		int right=treeCount(root.right);
//		int temp= left + right + root.data;
//		root.data=temp;
//		return root.data;
//		
//	}
	
	public static int treeCount (SumTree root) {
		int count=0;
		
		if (root==null) {
			return 0;
		} else {
			count++;
		}
		int left= treeCount(root.left);
		int right=treeCount(root.right);
		int temp= left + right + 1;
		
		return temp;
	}
}
