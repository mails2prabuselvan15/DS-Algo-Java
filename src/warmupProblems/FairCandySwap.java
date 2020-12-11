package warmupProblems;

public class FairCandySwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr1[]= {1,1};
//		int arr2[]= {2,2};
		
		int arr1[]= {1,2};
		int arr2[]= {2, 3};
		
//		int arr1[]= {2};
//		int arr2[]= {1,3};
		
//		int arr1[] = {1,2, 5};
//		int arr2[]= {2,4};
		
//		int arr1[] = {35,17,4,24,10};
//		int arr2[] = {63,21};
		
		candyswap(arr1, arr2);
		
//		int findMax1 = findMax(arr1);
//		int findMax2= findMax(arr2);
		
//		System.out.println(findMax1);
//		System.out.println(findMax2);
		
//		int temp = arr1[findMax1];
//		arr1[findMax1] = arr2[findMax2];
//		arr1[findMax1]=temp;
//		
//		System.out.println(arr1[findMax1]);
//		System.out.println(arr2[findMax2]);
		
		
	}

	
	public static void candyswap(int arr1[], int arr2[]) {
	
//		int arr3[]=new int[2];
		int temp1=0;
		for (int i=0;i <arr1.length; i++) {
			temp1+=arr1[i];
		}
		System.out.println("Temp1 is "+temp1);
		
		int temp2=0;
		
		for (int j=0; j<arr2.length;j++) {
			temp2+=arr2[j];
		}
		System.out.println("Temp2 is "+temp2);
		
		if (temp1 > temp2) {
			int finMin = finMin(arr2);
			System.out.println("Min Element is "+finMin);
			int findNearestMinElement = findNearestMinElement(arr1, arr2[finMin]);
			System.out.println("Nearest Element is "+ findNearestMinElement);
		
			System.out.println(arr2[finMin]);
			System.out.println(arr1[findNearestMinElement]);
		} else {
			
		}
		
	
////		exchange
//		int len1=arr1.length;
//		int len2=arr2.length;
//		int prev1 =0 ;
//		int prev2 =0 ;
//
//			for (int i=0; i<arr1.length;i++) {
//				if (temp1!= temp2) {
//					int curr1 = arr1[i];
//					int curr2= arr2[i];
//					int val1 = curr1+ prev1;
//					int val2 = curr2+ prev2;
//					if (val1 != val2) {
////					shift the values
//						int temp = arr1[i];
//						arr1[i]=arr2[i];
//						arr2[i]=temp;
//						prev1= arr1[i];
//						prev2=arr2[i];
//						temp1=arr1[i];
//						temp2=arr2[i];
//					} else {
//						System.out.println("i th value is "+ prev2);
//						System.out.println("j th value is "+prev1);
//						break;
//					}
//					
//				}
//			}	
	}
	
	public static int findMax(int arr[]) {
		
		int res=0;
		for (int i=1;i <arr.length;i ++) {
			if (arr[i]> arr[res]) {
				res=i;
			} 
		}
		return res;
	}
	
	public static int finMin(int arr[]) {
		int res = 0;
		for (int i=1; i<arr.length; i++) {
			if (arr[i]< arr[res]) {
				res=i;
			}
		}
		return res;
	}
	
	public static int findNearestMinElement(int arr[], int finMin) {
		
		int res= 0;
		for (int i=1; i<arr.length; i++) {
			if (arr[i] < arr[res] && arr[i] > finMin ) {
				res =i;
			}
		}
		return res;
	}
}
