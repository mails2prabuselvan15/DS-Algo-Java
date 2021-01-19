package arrayProblems;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = {3,2,2,3};
		
		int val= 3;
		int remove = remove(nums , val);
		System.out.println("Output is "+ remove);
	}

	public static int  remove(int nums[], int val) {
		int index=0;
		for (int i=0; i<nums.length; i++) { 
			 if(nums[i]!=val) {
				 nums[index++]=nums[i];
			 } 
		}
		return index;
	}
}
