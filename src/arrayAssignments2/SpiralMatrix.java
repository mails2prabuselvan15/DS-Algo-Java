package arrayAssignments2;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int matrix[][] = new int [3][3];		
//		int arr[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
//		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		int arr[][] = {{2,3}};
		List<Integer> spiral = spiral(arr);	
		for(int i=0; i<spiral.size();i++) System.out.println(spiral.get(i));
	}
	
	public static List<Integer> spiral(int matrix[][]) {
		List <Integer> l1= new ArrayList<Integer>();
		int col=0;	
		int len = matrix.length;
		for (int i=0; i<matrix.length;i++) {
			if (i==0 && col==0) {
				for (int j=col; j<matrix[i].length; j++) {
					l1.add(matrix[i][j]);
				}
//				if(matrix.length== matrix[i].length ) return l1;
				col=matrix[i].length-1;
			}
			System.out.println("row " + matrix.length);
			System.out.println("col "+matrix[i].length);
			
			if (matrix.length<=matrix[i].length) {
				if (i==1 && col==matrix[i].length-1) {
					for (int m=i; m<len;m++) {
						l1.add(matrix[m][col]);
					}
				}
				
				if (i==len-1 && col==matrix[i].length-1) {
					for (int k=col-1; k>=0; k--) {
						l1.add(matrix[i][k]);
						col=k;
					}
				}
				
				if (i==len-1 && col==0) {
					for (int l=i-1; l>=1; l--) {
						l1.add(matrix[l][col]);
						i=l-1;
						col=l;
					}	 	
					
				}else if (i==1 && col==1) {
					for (int q= col; q<matrix[i].length-1; q++) {
						l1.add(matrix[i][q]);
					}
				}
			}
			
		}
		return l1;
	}
}







