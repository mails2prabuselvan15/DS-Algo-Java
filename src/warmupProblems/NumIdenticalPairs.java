package warmupProblems;

public class NumIdenticalPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[]= {1,2,3,1,1,3};
//		int arr[] = {1,1,1,1};
		int arr[]= {1,2,3};
		int findPairs = findPairs(arr);
		System.out.println(findPairs);
	}
	
	public static int findPairs( int arr[] ) {
		int max= 0;
		int count=0;
		for (int i=0; i<arr.length; i++) {
		
			for (int j=i+1; j<arr.length; j++) {
				if (arr[i]==arr[j]) {
					count++;
				}
			}
			max=Math.max(max, count);
		}
		return max;
	}
}
