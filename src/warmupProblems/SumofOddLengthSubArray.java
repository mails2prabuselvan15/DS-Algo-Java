package warmupProblems;

public class SumofOddLengthSubArray {

	public static void main(String[] args) {
		
		int arr[]= {1,4,2,5,3};
		
		oddLength(arr);

	}

	public static void oddLength(int[] arr) {
		
		int temp1=0;
		
		for(int i=0;i<arr.length;i++) {
			temp1+=arr[i];
		}
		System.out.println(temp1);
		
	}
}
