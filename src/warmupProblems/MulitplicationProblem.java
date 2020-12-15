package warmupProblems;

public class MulitplicationProblem {

	public static void main(String[] args) {

		int arr[] = {2, 3, 4, 5, 6};
//		int arr[]  = {1};
//		int arr[]= {};
		int[] multiply = multiply(arr);

		
		for (int i=0; i<multiply.length; i++) {
			System.out.println(multiply[i]);
		}
		}
	
	public static int[] multiply(int arr[]) {
		int prev = 0;
		if (arr.length<=1) {
			return arr;
		}
		for (int i=0; i< arr.length; i++) {
		int temp=0;
		int curr =arr[i];
		  if (i==0) {
		    temp=arr[i]*arr[i+1];
		  } else if(i==arr.length-1) {
		    temp= arr[i]*prev;
		  }
		  else{
		    temp= prev * arr[i+1];
		  }
		  arr[i]= temp;
		  prev=curr;
		}
		return arr;
	}
 
}
