package arrayProblems;

public class SearchAndInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = {1,3,5,6};
		
//		int nums[] = {1};
		
		int target = 0;
		int searchInsert = searchInsert(nums, target);
		System.out.println("output is "+ searchInsert);
		
	}

public static int searchInsert(int[] nums, int target) {
        
        for (int i=0; i<nums.length;i ++) {
            if (nums[i]== target) {
                return i;
            }
        }
        for (int i=0; i<nums.length-1; i++) {
            if(nums[i] < target && nums[i+1] > target) {
                return i+1;
            } else if(nums[i] > target && nums[i+1] > target) {
            	return i;
            }
        }
        
        if (nums.length==1) {
        	return 0;
        } else {
        	return nums.length;
        }  
    }
}
