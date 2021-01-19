package binaryTree;

public class Node {
	
	char data;
	Node left;
	Node right;
	
	Node(char data) {
		this.data=data;
		this.left=null;
		this.right=null;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node A= new Node('A');
		Node B= new Node('B');
		Node C= new Node('C');
		Node D= new Node('D');
		Node E= new Node('E');
		Node F= new Node('F');
		Node G= new Node('G');
		
		
		A.left=B;
		A.right=C;
		B.left=D;
		B.right=E;
		C.left=F;
		C.right=G;
		
		
//		inorder(A);
		
//		preorder(A);
		
//		postorder(A);
		
//	 System.out.println(sizeofTree(A));
		
		System.out.println(heightofTree(A));
		
	
	}
	
	public static void inorder(Node root) {
		
		if(root==null) return;
		
		inorder(root.left);
		
		System.out.println(root.data);
		
		inorder(root.right);
	}
	
	public static void preorder(Node root) {
		
		if(root==null) return;
		System.out.println(root.data);
		preorder(root.left);
		preorder(root.right);
	}
	
	public static void postorder(Node root) {
		if (root==null) return;
		
		postorder(root.left);
		postorder(root.right);
		System.out.println(root.data);
	}
	
	public static int heightofTree(Node root) {
	if(root==null ) return 0; 
	return Math.max(heightofTree(root.left), heightofTree(root.right)+1);

	}
	
	
	public static int sizeofTree(Node root) {
		
		if (root==null) return 0;
		
		int left  =sizeofTree(root.left);
		int right = sizeofTree(root.right);
	
		int count=  1 +left+right;
		
		return count;
	}
	

	
 }
