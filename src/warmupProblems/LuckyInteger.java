package warmupProblems;

import java.util.HashMap;

public class LuckyInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int arr[] = {2,2,3,4};
		
		int arr[]= {1,2,2,3,3,3};
		
//		int arr[] = {2,2,2,3,3};
		
//		int arr[]= {7,7,7,7,7,7,7};
		
//		int arr[]= {14,14,19,11,6,4,16,17,3,7,7,5,15,12,3,20,1,13,5,20,1,12,10,2, 14};
		
		int luckyNumber = luckyNumber(arr);
		System.out.println(luckyNumber);
	}

	public static int luckyNumber(int arr[]) {
		int max =-1;
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		for (int i=0;i <arr.length; i++) {
			int count=1;
			if (!hmap.containsKey(arr[i])) {
			for (int j=i+1; j<arr.length; j++) {
				hmap.put(arr[i], i);
				if (arr[i]==arr[j]) {
					count++;
				}
			}
			if (count==arr[i]) {
				max=Math.max(max, count);	
			} else if (count <=arr[i] ){
				max=max;
			}
			
		}
	}
		return max;
	}
	
	public int findLucky(int[] arr) {
       	int max =-1;
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		for (int i=0;i <arr.length; i++) {
			int count=1;
			if (!hmap.containsKey(arr[i])) {
			for (int j=i+1; j<arr.length; j++) {
				hmap.put(arr[i], i);
				if (arr[i]==arr[j]) {
					count++;
				}
			}
			if (count==arr[i]) {
				max=Math.max(max, count);	
			} else if (count <=arr[i] ){
				max=max;
			}
			
		}
	}
		return max;
    }

}
