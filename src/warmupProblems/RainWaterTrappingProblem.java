package warmupProblems;

public class RainWaterTrappingProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int arr[]= {0,1,0,2,1,0,1,3,2,1,2,1};
		
		int arr[]= {1,3,0,1,2,0,4,1,2};
		rainWaterPbm(arr);
	
	}
	
	public static void rainWaterPbm(int arr[]) {
		int[] leftMax = leftMax(arr);
		int[] rightMax = rightMax(arr);
		
		int res = 0;
		for(int i=0; i<arr.length; i++) {
			int min = Math.min(leftMax[i], rightMax[i]);
			res+=min-arr[i];
		}
		System.out.println("Final Answer is "+res);
			
	}
	
	public static int[] leftMax(int arr[]) {	
		int n=arr.length;
		int leftArr[] =new int[n];
		leftArr[0]=arr[0];
		int max=arr[0];
		for(int i=1; i<n; i++) {
			if (arr[i] > max) {
				leftArr[i] = arr[i];
				max=arr[i];
			} else {
				leftArr[i] =max;
			}
		}
		return leftArr;
	}
	
	public static int[] rightMax(int arr[]) {
		
		int n =arr.length;
		int rightArr[]= new int[n];
		rightArr[n-1] =  arr[n-1];
		int max=arr[n-1];
		for(int i=n-2;i>=0;i--) {
			if (arr[i]> max) {
				rightArr[i] = arr[i];
				max=arr[i];
			} else {
				rightArr[i]= max;
			}
		}
		return rightArr;
	}
	
}
