package arrayProblems;

import java.util.HashSet;

public class Triplets {
	public static void main(String[] args) {
		
//		  int arr[]= {1, 5, 3, 2};
//		int arr[]= {2,3,4};
		int arr[] = {14, 3 , 6 ,8 ,11 ,16};
				
		
 		int findTriplets = findTriplets(arr, arr.length);
		  System.out.println("Triplets "+ findTriplets);
	}
	
	public static int findTriplets(int arr[], int n) {
		HashSet<Integer> hset =  new HashSet<Integer>();
	    for (int i=0;i <n; i++) {
	      hset.add(arr[i]);
	    }

	    int temp = 0;
	    int count=0;
	    for (int i=0;i < n; i++) {
	      for (int j=i+1;j<n; j++) {
	        temp = arr[i] + arr[j];
	        	if(hset.contains(temp)) {
	        		count++;
	        		
	        	}
	      }
	    }
	    return count;
	}

}
