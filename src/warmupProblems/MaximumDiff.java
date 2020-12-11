package warmupProblems;

public class MaximumDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int arr[]= {2, 3,10,6,4,8,1};
		
//		int arr[] = {7,9,5,6,3,2};
		
//		int arr[]= {10,20,30};
		
		int arr[] = {30,10,8,2};
		

		maximumDiff(arr);
	}

	public static void maximumDiff(int arr[]) {
		int prevdiff=Integer.MIN_VALUE;
		for (int i=0; i<arr.length; i++ ) {
			int diff;
			for (int j=i+1; j<arr.length; j++) {
				diff=arr[j] -arr[i];
				if (diff> prevdiff) {
					prevdiff=diff;
				}
				
			}
		}
	System.out.println("Maximum difference is "+prevdiff);
		
	}
}
