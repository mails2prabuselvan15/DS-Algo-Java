package warmupProblems;

public class BinaryArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Replacing 0 by 1 so that will get maximum number of ones
		int arr[]= {0,1,1,1,0,1,0,1,0,1,0,1};
		int maxOne = maxOne(arr);
		System.out.println("After Replacing One  Zero by 1 is  "+ maxOne);
		
	}

//	my solution using hashmap or Array
	public static int maxOne(int arr[]) {
		int n =arr.length;
		int newArr[]= new int[n];
		int j=0;
		for(int i=0; i<n; i++) {
			if (arr[i]== 0) {
				newArr[j]=i;
				j++;
			}
		}
		int max=0;
		int temp=0;
		for (int i=1; i<=j; i++) {
			temp=newArr[i]- newArr[i-1];
			max=Math.max(max, temp);
		}
	return max+1;
	}
	
//	Using Sliding Window
	public static int maxOneSlidingWindow(int arr[]) {
		
		return 0;
	}
}
