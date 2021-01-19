package warmupProblems;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
	
//		int nums[]= {2,7,11,15};
//		int target= 9;
		
//		int nums[]= {3,2,4};
		int nums[]= {2,3,4};
		int target= 6;
		int[] twosum = twosum(nums, target);
		
		for(int i=0; i<twosum.length; i++) System.out.println(twosum[i]);

	}
	
//	 public static int[] twoSum(int[] nums, int target) {
//	        int start= 0;
//	        int end= nums.length-1;
//	        int arr[]= new int[2];
//	        while (start< end ) {
//	            int temp = nums[start] + nums[end];
//	            System.out.println("temp value "+temp);
//	            if(temp>target) {
//	                end--;
//	            } else if (temp< target) {
//	                start++;
//	            } else {
//	                arr[0]=start;
//	                arr[1] = end;
//	                break;
//	                		
//	            }
//	        }
//	        return arr;
//	    }
	
	public static int[] twosum(int nums[], int target) {
		HashMap<Integer, Integer> hmap =  new HashMap<Integer, Integer>();
		for (int i=0; i< nums.length; i++) {
			int comp=target- nums[i];
			if(hmap.containsKey(comp)) {
				return new int[] {hmap.get(comp),i};
			}
			hmap.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}

}
