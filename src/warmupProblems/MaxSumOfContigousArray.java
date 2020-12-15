package warmupProblems;

public class MaxSumOfContigousArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int arr[]= {2,1,5,1,3,2};
//		int k=3;
		
		int arr[]= {1,9,-1,-2,7,3,-1,2};
		int k=4;
//		int subArray = subArray(arr, k);
//		System.out.println("Max Element is "+ subArray);
		
//		int subArray1 = subArray1(arr, k);
//		System.out.println("Sub Array is "+ subArray1);
		
		int subArray2 = subArray2(arr, k);
		System.out.println("Max Element is "+ subArray2);
	}

//	Solution 1
	public static int subArray(int arr[] ,int  k) {
		int newArray[] = new int [k];
		int max=0;
		for (int i=0; i<arr.length;i++) {
			int temp= arr[i];
			int count=0;
			for (int j=i+1;j <arr.length; j++) {
				count++;
				if (count==k)  break;
				else  temp+=arr[j];		
			}	
			if (temp> max) {
				max=temp;
			}
		}
		return max;
	}
	
//	Solution 2
	public static int subArray1(int arr[], int k) {
		int maxSum=0;
		for (int i=0; i<arr.length-k; i++) {
			int windowSum = 0;
			for (int j=i; j< i+k; j++) {
				windowSum+=arr[j];
			}
			maxSum=Math.max(maxSum,windowSum);
		}
	return maxSum;
	}
	
//	Solution 3 Sliding Window Technique
	
	public static int subArray2(int arr[], int k) {
		
//		find out the sum of k numbers -- temp
//		increment the end once and decrement the i values
//		temp+a[end]-a[end-k]
		
		int temp=0;
		int maxSum=0;
		
		for (int i=0; i< k; i++) {
			temp+=arr[i];
		}
		for (int end=k; end<arr.length; end++) {
			temp+=arr[end]-arr[end-k];
			maxSum=Math.max(maxSum, temp);
		}
	
		return maxSum;
	}
}
