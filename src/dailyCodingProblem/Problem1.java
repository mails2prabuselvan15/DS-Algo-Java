package dailyCodingProblem;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {10, 15, 3, 7};
		int  k =17;
		
		boolean add = add(arr, k);
		System.out.println("output is "+ add);
		
	}
	
	public static boolean add(int arr[], int k) {
		
		for (int i=0; i< arr.length; i++ ) {
			for (int j=i+1; j< arr.length; j++) {
				if (arr[i] + arr[j] ==k) {
					return true;
				}
 			}
		}
		return false;
	}

}
