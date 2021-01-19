package arrayProblems;

public class FlippingImage {

	public static void main(String[] args) {
		
//		int A[][] = { {1,1,0} , { 1,0,1} ,  {0,0,0} };
		
		int A[][]= {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};

		int[][] flip = flip(A);
		
		for(int i=0; i<flip.length; i++) {
			for (int j=0; j<flip[i].length; j++) {
				System.out.print(flip[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public static int[][] flip(int A[][]) {
		
		int B[][]= new int[A.length][A.length];

		for (int i=0; i<A.length; i++) {
			int k=0;
			for(int j=A[i].length-1; j>=0; j--) { 
				B[i][k]=A[i][j];
				k++;
			}			
		}
		
		for (int i=0; i<B.length; i++) {
			for (int j=0;j<B[i].length; j++) {
				if (B[i][j]==1) B[i][j]=0;
				else B[i][j]=1;
			}
		}
		return B;
	}

}
