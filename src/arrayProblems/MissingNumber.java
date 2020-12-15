package arrayProblems;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[]= {1,2,3,5};
		int arr[]= {1,2,3,4,5,6,7,8,10};
//		int arr[] = {};
//		int findMissingNum = findMissingNum(arr, arr.length);
		
//		findMissingNum1(arr, arr.length);
		
		findMissingNum2(arr, arr.length);;
	}
	
//	First Solution
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
	
//	Second Solution
	
	public static void findMissingNum1(int arr[], int n) {
		int temp1=0;
		for(int i=0;i<n;i++) {
			temp1+=arr[i];
		}
//		System.out.println("temp1 is " + temp1);
		int temp2=0;
		int n2= arr[arr.length-1];
		for (int i=1; i<=n2;i++) {
//			System.out.println("i value is "+ i);
			temp2+=i;
			
		}
		System.out.println("temp2 is "+ temp2);
		System.out.println(temp2- temp1);	
	}

//	Third Solution using XOR operator
	
	public static void findMissingNum2(int arr[], int n) {
		
		int temp1=0;
		for(int i=0;i <n;i++) {
			temp1= temp1 ^ arr[i];
		}
//		System.out.println("temp1 is "+ temp1);
		
//		System.out.println("n value is "+ n);
		int temp2=0;
		for(int i=1;i<=n+1; i++) {
			temp2 =temp2 ^ i;
		}
//		System.out.println("temp2 is "+ temp2);
		
		int temp3 =0;
		temp3=temp2 ^ temp1;
		System.out.println(temp3);
	}
 
}
