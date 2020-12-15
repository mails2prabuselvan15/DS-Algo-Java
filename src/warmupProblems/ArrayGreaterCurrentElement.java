package warmupProblems;

public class ArrayGreaterCurrentElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {16,17, 4,3,5,2};
		
		int[] greaterReplaceCurrentElement = greaterReplaceCurrentElement1(arr);
		
		for (int i=0;i <greaterReplaceCurrentElement.length; i++) {
			System.out.println(greaterReplaceCurrentElement[i]);
		}
	}

//	This is O(n^2)
	public static int[] greaterReplaceCurrentElement(int arr[] ) {
		
		for (int i=0; i<arr.length; i++) {
			for (int j=i+1; j<arr.length; j++) {
				if(arr[j] >arr[i] ) {
					arr[i] =arr[j];
				}
			}
		}
		return arr;
	}
	
//	This is O(n)
	
	public static int []  greaterReplaceCurrentElement1(int arr[]) {
		
		int len=arr.length;
		
		int temp =arr[len-1];
		for(int i=len-2; i >=0; i--) {
			int curr = arr[i];
			if (arr[i] < temp) {
				arr[i]= temp;
			} else {
				temp=curr;
			}
		
		}
		
		return arr;
	}
}
