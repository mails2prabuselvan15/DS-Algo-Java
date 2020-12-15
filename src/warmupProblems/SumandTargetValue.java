package warmupProblems;

import java.util.Arrays;
import java.util.HashMap;

public class SumandTargetValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {2,1,7,8,4,6,5};
		int val =12;
		
		findPair3(arr, val);	
	
	}
//	Brute Force approach
//	O(n^2)
	public static void findPair1(int arr[] , int val) {
			for (int i=0; i <arr.length-1; i++) {
				for (int j=i+1; j<arr.length; j++) {
					int temp = arr[i]  + arr[j];
					if (temp ==val) {
						System.out.println("[" + arr[i] + "]"  + "[" + arr[j] + "]");
					}
				}
			}
	}
	
//	Two Pointer Approach
//	First Sort the Array
//	O(nlogn +  n )
	
	public static void findPair2(int arr[], int val ) { 
	
		Arrays.sort(arr);
		
		int i=0; int j=arr.length-1;
		while( i < j) {
			int temp = arr[i] + arr[j];
			if (temp==val) {
				System.out.println("[" + arr[i] + "]" + "[" + arr[j] + "]");
				i++;
				j--;
			} else if( temp < val){
				i++;
			}else {
				j--;
			}
		}
	}
	
	public static void findPair3(int arr[], int val) {
		 
		HashMap<Integer, Integer> hmap= new HashMap<Integer, Integer>();
		int temp=0;
		for (int i=0;i <arr.length; i++) {
			
			int curr= arr[i];
			temp=val-curr;
			if(!hmap.containsKey(temp)) {
				hmap.put(arr[i], i);
			} else {
				System.out.println(arr[i] +" - " + temp);
			}

		}
	}
}
