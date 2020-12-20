package warmupProblems;

public class SumOfSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int arr[]= {2,7,11,15};
//		int target =9;
		
		int arr[]= {2,3,4};
		int target =6;
		
//		int arr[]= {-1,0};
//		int target =-1;
		
//		int arr[]= {5,25,75};
//		int target =100;
		int[] sortedArray1 = sortedArray1(arr, target);
		
		for (int i=0; i<sortedArray1.length; i++) {
			System.out.println(sortedArray1[i]);
		}
	}

//	public static int[] sortedArray(int arr[], int target) {
//		int newArr[]= new int [2];
//		for (int i=0;i <arr.length;i ++) {
//				for (int j=i+1; j<arr.length; j++) {
//					if (arr[i] + arr[j]==target) {
//						newArr[0]=i+1;
//						newArr[1]= j+1;
//						break;
//					}
//				}
//		}
//	return newArr;
//	}
	
	public static int[] sortedArray1(int numbers[], int target) {
		
		int newArr[]= new int [2];
		int temp=0;
		int res=0;
		int prev=0;
		for (int i=1;i <numbers.length;i++) {
			temp=numbers[i] + numbers[res];
			if(temp == target) {
				newArr[0]=res+1;
				newArr[1]= i+1;
				break;
			}else if(temp < target) {
				res=i;
			}else if (temp > target) {
				res=i-2;
			}
		}
	return newArr;
	}
	
}
