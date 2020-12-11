package warmupProblems;

public class ArrayGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {6,2,4,5,3,1};
		System.out.println("Input Array is " + arr);
//		int[] replace = replace(arr);
		int[] replace = replacefromRight(arr);
		
		System.out.println("***** After replace ******");
		
		
		for (int i=0; i<replace.length; i++) {
			System.out.println(replace[i]);
		}
 
	}
	
//	public static int[] replace(int arr[]) {
//		int n =arr.length;
//		int temp = arr[n-1];
//		arr[n-1]= -1;
//		for (int i=n-2;i>=0; i--) {
//			
//			int curr =arr[i];
//			
//			if(arr[i+1] > temp) {
//				arr[i] =arr[i+1];
//			} else {
//				arr[i] = temp;
//			}
//			temp= curr;
//		}
//	return arr;
//	}
	
	public static int[] replace(int arr[]) {
		
		int len =arr.length;
		System.out.println("Array length is "+len);
		int temp = arr[len-1];
		arr[len-1] = -1;
		int max = 0;
		
		for (int i=0; i< len-1; i++) {
			if (len-2 != i) {
				 max= 0;
			} else {
				arr[i] =temp;
				return arr;
			}

			for (int j= i+1 ; j<len-1; j++) {
				if (arr[j]  >  max ) {
					max= arr[j];
				}
			}
			arr[i]=max;
		}
		return arr;
	}
	
//	This is O(n) Solution
	
	public static int[] replacefromRight(int arr[]) { 
		int len =arr.length;
		
		int temp =arr[len-1];  // getting the last value from the array
		arr[len-1] = -1;
		for (int i=len-2; i>=0 ;i--) {
			int curr = arr[i];
			
			if (arr[i+1] > temp) {
				arr[i] = arr[i+1];
			} else {
				arr[i]=temp;
			}
			temp=curr;
		}
		return arr;
	}
}
