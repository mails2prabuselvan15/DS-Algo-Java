package warmupProblems;

import java.util.ArrayList;
import java.util.List;

public class MinimumAbsoluteDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int arr[] = {4,2,1,3};
		
		int arr[] = {1,3,6,10,15};
		minDiff(arr);
	}

	public static void minDiff(int arr[ ]) { 
		
		int temp1, temp2;

		
		for( int i=0; i<arr.length; i++) {
			int temp;
			int prev = 0;
			int leastVal;
			List <List<Integer>> al = new ArrayList<List<Integer>>();
			for (int j=i+1; j<arr.length; j++) {
				temp= arr[i] -arr[j];
					if(temp< prev ) {
						leastVal=temp;
						if (arr[i] <  arr[j]) {
							System.out.println("[ "+arr[i] +  " " + arr[j]+ "]");
//							al.add(temp, arr[i], arr[j]);
							
						} else {
							System.out.println("[ "+arr[j] +  " " + arr[i]+ "]");
							al.addAll(temp, al);
						}
						
					}
					prev=temp;
				
				
			}
		}
	}
}
