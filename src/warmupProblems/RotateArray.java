package warmupProblems;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,5,6,7};
		int k=3;
		
//		int arr[]= {-1,-100,3,99};
//		int k=2;
		
//		int arr[]= {-1};
//		int k=2;
		
//		int arr[] = {1,2};
//		int k=2;
		
//		int arr[] = {1,2,3};
//		int k=4;
		int[] rotateArray = rotateArray(arr, k);
		for(int i=0; i<rotateArray.length;i++) {
			System.out.println(rotateArray[i]);
		}

//		int[] reverse = rotateArray1(arr, k);
//		for (int i=0; i<reverse.length; i++) {
//			System.out.println(reverse[i]);
//		}
	}

//	O(n) Extra space
//	O(n) Time complexity
	public static int [] rotateArray(int arr[], int k) {
		int len=arr.length;
		int newArr[]= new int[len];
		int j=0;
		for(int i=len-k;i<len;i++) {
			newArr[j] =arr[i];
			j++;
		}
		
		
		
		for (int k1=0; k1<len-k; k1++) {
			newArr[j]= arr[k1];
			j++;
		}
		return newArr;
	}
	
	public static int[] rotateArray1(int nums[], int k) {
		int start=0;
		int len=nums.length;
		int []reverse = null;
		if (len>=k) {
			reverse(nums, len-k, len);
			reverse(nums, start, len-k);
			 reverse = reverse(nums, start, len);	
		} else {
			reverse=reverse(nums, start, len);	;
		}
		return reverse;
		
	}
	
	
	
	public static int[] reverse(int arr[],int low, int high) {
		int end=high-1;
		while(low< end) {
			int temp = arr[low];
			arr[low]= arr[end];
			arr[end]=temp;
			low++;
			end--;
		}
		return arr;
	}
}
