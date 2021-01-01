package searching;

public class RotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {4,5,6,7,0,1,2};
		int low=0;
		int high=arr.length-1;
		int target = 0;
		int searchRotatearray = searchRotatearray(arr, low, high, target);
		System.out.println("Search in rotated and sorted array is "+ searchRotatearray);

	}
	
	public static int searchRotatearray(int arr[], int low, int high, int target) {
		
		while(low<=high) {
			int mid = (low+high)/2;
			System.out.println("mid value is "+arr[mid]);
			if(arr[mid]==target) return mid;
			else if(arr[mid]>target && arr[mid-1]>=target ) {
				low= mid+1;
			} else if(arr[mid]> target && arr[mid-1]>=target) {
				high=mid-1;
			}
		}
		return-1;
	}

}
