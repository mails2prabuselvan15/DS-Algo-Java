package arrayProblems;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,4,5};
		reverse(arr);
		
		for(int i: arr) System.out.println(i);
		
	}
	
	static void reverse(int arr[]) {
		int low=0;
		int high=arr.length-1;
		int temp;
		while(low < high) {
			temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++;
			high--;
		}
	}

}
