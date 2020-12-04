package arrayProblems;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[]= {1,2,3,5};
		int arr[]= {1,2,3,4,5,6,7,8,10};
//		int arr[] = {};
		int findMissingNum = findMissingNum(arr, arr.length);
		System.out.println("Missing Number is "+ findMissingNum);
	}
	
	public static int findMissingNum(int arr[], int n) {
		
		int temp = 0;
		for (int i=1;i <n; i++) {
			 temp =arr[i-1];
			if(arr[i]== temp+1) { 
				continue;
			} else {
				break;
			}
		}
		if (n==0) {
			return 0;
		} else {
			return temp+1;
		}
		
		
	}
	

}
