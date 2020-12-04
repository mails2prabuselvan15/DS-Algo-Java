package arrayProblems;

public class Sorting1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {0, 2, 1, 2, 0};
//		int arr[]= {0, 1 ,0};
		int[] sorting = sorting1(arr, arr.length);
		
		System.out.println("After Sorting ");
		for (int i=0; i< sorting.length;i++) {
			System.out.println(sorting[i]);
		}
	}

	public static int[] sorting(int arr[], int n) {
		for (int i=0; i<n; i++) {
			for (int j=i+1; j<n; j++) {
				if(arr[i]> arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		return arr;
		
	}
	
	public static int[] sorting1(int arr[], int n) {
		
		int res = 0;
		int temp=0;
		for (int i=1; i<n; i++) {
			if (arr[i] < arr[i-1]) {
				temp=arr[i];
				arr[i]=arr[i-1];
				arr[i-1]=temp;
//				res++;
				
			}
		}
		
		return arr;
	}
	
}
