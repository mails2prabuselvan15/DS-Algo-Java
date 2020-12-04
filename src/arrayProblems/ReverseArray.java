package arrayProblems;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,4,5};
		reverse(arr, arr.length);
		
		for(int i: arr) System.out.println(i);
		
	}
	
	static void reverse(int arr[], int n) {
		int low=0;
		int high= n-1;
		
		while (low < high) {
			int temp = arr[low];
			arr[low]= arr[high];
			arr[high]=temp;
			low++;
			high--;
		}
	}

}
