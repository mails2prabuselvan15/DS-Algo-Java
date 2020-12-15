package warmupProblems;

public class ShuffleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int arr[] = {2,5,1,3,4,7};
//		int n=3;
		
//		int arr[]= {1,2,3,4,4,3,2,1};
//		int n=4;
		
		int arr[] = {1,1,2,2};
		int n=2;
		int[] shuffle = shuffle(arr, n);
		for(int i=0; i<shuffle.length; i++) {
			System.out.println(shuffle[i]);
		}
		
	}

	public static int [] shuffle( int nums[] , int n ) {
		
		int len= nums.length;
		int newArr[]= new int [len];
		int k=0;		
		for (int i=0; i<n; i++) {
			newArr[k]=nums[i];
			newArr[++k]=nums[i+n];
			k++;
			
		}
			return newArr;
		}
}
