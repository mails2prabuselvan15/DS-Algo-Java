package searching;

public class BinarySearch {

	public static void main(String[] args) {
		
//		int arr[]= {10,20,30,40,50,60,70};
//		int arr[]= {5,15,25};
//		int arr[]= {5,10,15,25,35};
//		int arr[]= {10,15};
		int arr[]= {10, 10};
		int low=0;
		int high=arr.length-1;
		int element= 10;
		
		int findelement = findelement(arr, element, low, high);
		System.out.println("Element is "+ findelement);
		
	}
	
	
	public static int  findelement(int  arr[],int element , int low, int high) {
		while(low<=high) {
			int mid = (low+ high) /2; 
			if(arr[mid]==element) return mid;
			else if (arr[mid]> element) {
				high=mid-1;
			} else {
				low=mid+1;
			}
		}
		return  -1;
	}
	
}
                  