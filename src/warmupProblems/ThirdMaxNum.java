package warmupProblems;

import java.awt.SecondaryLoop;

public class ThirdMaxNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[]= {3, 2, 1};
//		int arr[]= {1,2};
//		int arr[]= {2, 2, 3, 1};
		
//		This is pending yet to complete
		
		int arr[]= {10,40,20,80};

		int firstMax = firstMax(arr);
		System.out.println(firstMax);
		
		for (int i=0;i<arr.length; i++) {
			secondMax(arr, firstMax);
		}
	}
	
	public static int firstMax(int arr[]) {
		
		int max=arr[0];
		for(int i=1;i <arr.length; i++) {
			if (arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	
	public static int secondMax( int arr[], int max) {
		int secondMax=arr[0];
		for (int i=1;i<arr.length; i++) {
			if (arr[i] > secondMax && arr[i]<max) {
				secondMax=arr[i];
			}
		}
		return secondMax;
	}
	
	
}
