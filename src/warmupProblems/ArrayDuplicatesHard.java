package warmupProblems;

import java.util.Arrays;

public class ArrayDuplicatesHard {

	public static void main(String[] args) {

		int arr[] = {4,3,2,7,8,2,3,1};
		ArrayDup(arr);
	}
	
//	1,2,2,3,3,4,5,6,7
	
	public static void ArrayDup(int arr[]) {
		
		Arrays.sort(arr);
		int j=0;
		int count=0;
		int dupcount=0;
		for (int i=0; i<arr.length-1; i++) {
			if (arr[i]== arr[i+1] && count==0) {
				count++;
				dupcount++;
				arr[j]=arr[i];
//				System.out.println("arr[j] is "+arr[j]);
				j++;
				count=0;
			}
			
			
		}
		arr= new int[dupcount];
	}

}
