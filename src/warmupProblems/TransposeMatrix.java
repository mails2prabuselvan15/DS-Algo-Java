package warmupProblems;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int arr[][]= {{1,2,3}, {4,5,6}, {7,8,9}};
		int arr[][] = {{1,2,3}, {4,5,6}};
		
		int[][] transpose = transpose(arr);
		
		for(int i=0; i<transpose.length; i++) {
			for (int j=0; j<transpose[i].length; j++) {
				System.out.println(transpose[i][j]);
			}
		}

	}
	
	public static int [][] transpose(int A[][]) {
		
		int row= A.length;
		int col = A[0].length;
		int newArr[][] = new int[col][row];
		for (int i=0; i< col; i++) {
			for (int j=0; j<row; j++) {
				System.out.print(A[j][i] +" ");
				newArr[i][j] =A[j][i];
			}
			System.out.println();
		}
	return newArr;	
	}
}
