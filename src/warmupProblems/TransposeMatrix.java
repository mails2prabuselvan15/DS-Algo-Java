package warmupProblems;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int arr[][]= {{1,2,3}, {4,5,6}, {7,8,9}};
		int arr[][] = {{1,2,3}, {4,5,6}};
		
		int[][] transpose = transpose(arr);
		
		System.out.println("After Transposing matrix");
		for (int i=0; i<transpose.length; i++) {
			for (int j=0; j<transpose[i].length; j++) {
				System.out.print(transpose[i][j] + " " );
			}
			System.out.println();
		}

	}
	
	public static int [][] transpose(int arr[][]) {
		int row = arr.length;
		int col=arr[0].length;
		
		int [][]newarr= new int[col][row];
		
		for (int i=0 ;i <arr.length; i++) {
			System.out.println(" rows column length  " +arr[i].length);
			for (int j=0 ;j<arr[i].length; j++) {
//				System.out.println(arr[j][j]);
				newarr[i][j]= arr[j][i];
				System.out.println("new array "+ newarr[i][j]);
			}
		}		
		return newarr;
	}

}
