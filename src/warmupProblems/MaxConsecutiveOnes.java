package warmupProblems;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
//		int arr[] = {1,1,0,1,1,1};
//		int arr[] = {1,0,1,1,0,1};
		
		int arr[] = {1};
		int maxOnes = maxOnes(arr);
		System.out.println("maxOnes "+ maxOnes);
	}
	
	public static int maxOnes(int nums[]) {
		int count=0;
		int max= count;
		if (nums.length==0) return 0;
		for (int i=0; i <nums.length; i++) {
			if(nums[i]==1) {
				count++;
			} else {
				count=0;
			}
			if (count > max) {
				max=count;
			}
			
		}
	return max;
	}

}
