package binaryTree;

public class MergeBinaryTree {
	
	int val;
	MergeBinaryTree left;
	MergeBinaryTree right;
	
	MergeBinaryTree(int val) {
		this.val=val;
	}
	
	public static void main(String[] args) {
		
		MergeBinaryTree t1one = new MergeBinaryTree(1);
		MergeBinaryTree t1two = new MergeBinaryTree(2);
		MergeBinaryTree t1three = new MergeBinaryTree(3);
		MergeBinaryTree t1five = new MergeBinaryTree(5);
		
		
		t1one.left= t1three;
		t1one.right= t1two;
		t1three.left=t1five;
		
		
		
		MergeBinaryTree t2two = new MergeBinaryTree(2);
		MergeBinaryTree t2one = new MergeBinaryTree(1);
		MergeBinaryTree t2three = new MergeBinaryTree(3);
		MergeBinaryTree t2four = new MergeBinaryTree(4);
		MergeBinaryTree t2seven = new MergeBinaryTree(7);
		
		
		t2two.left=t2one;
		t2two.right=t2three;
		t2one.right=t2four;
		t2three.right=t2seven;
		
		mergeTrees(t1one, t2two);
		
				
	}
	
	public static MergeBinaryTree mergeTrees(MergeBinaryTree t1, MergeBinaryTree t2) {
		
	
		
		int temp= 0;
		System.out.println("t1 value " +t1.val);
		System.out.println("t2 value " +t2.val);
		
		if(t1==null && t2==null) {
			return null;
		}
		else if( (t1!=null && t2!=null)) {
			System.out.println("Before t1.val  = "+t1.val);
			System.out.println("Before t2.val  = "+t2.val);
			temp=t1.val+t2.val;
			System.out.println("temp value is "+temp);
			t1.val=temp;
			System.out.println("After t1.val = "+t1.val);
		} else if (t1!=null && t2==null)  {
			t1.val=t1.val;
		} else if (t1==null && t2!=null) {
			t1.right= new MergeBinaryTree(t2.val);
		}
	
		System.out.println("t1.left.val " +t1.left.val);
		System.out.println("t2.left.val " +t2.left.val);
		mergeTrees(t1.left, t2.left);
		mergeTrees(t1.right, t2.right);
		
		return t1;
	}

}
