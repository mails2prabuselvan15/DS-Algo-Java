package warmupProblems;

public class SumOfOneDArray {

	public static void main(String[] args) {
		
//		int nums[] = {1,2,3,4};
		int nums[] = {3,1,2,10,1};

		
		
	}

	
	public static int[] sumofArray(int nums[]) {
		int temp=0;
		for (int i=0; i<nums.length; i++) {
			temp+=nums[i];
			nums[i]=temp;
			
		}
		
		return nums;
		
	}
}
