package warmupProblems;

public class TwoDArrayPbm {
	public static void main(String[] args) {
//		int  [][] arr= {{10,2}, {3,2},{20,30}};
//		int arr[][]= { {1,2,3}, {3,2,1}};
//		int arr[][]= {{1,5}, {7,3}, {3,5}};
		int arr[][]= {{2,8,7}, {7,1,3}, {1,9,5}};
		
		int arr1[]=new int[arr.length];
		int temp1;
		for (int i=0; i<arr.length; i++) { 
			
			temp1 =0;
		
			for (int j=0; j<arr[i].length; j++) {
				temp1+=arr[i][j];
			}
			
			arr1[i] =temp1;		
		}
		
		int  res=0;
		for (int i=1;i<arr1.length; i++) {
			if(arr1[i] > arr1[res]) {
				res=i;
			}
		}
		
		System.out.println(arr1[res]);
	
	}

}
