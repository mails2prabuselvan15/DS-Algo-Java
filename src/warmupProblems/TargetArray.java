package warmupProblems;

public class TargetArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 1}; 
		int index[] = {0};

		targetArray(nums, index);
	}

	public static int[] targetArray(int nums[], int index[]) {		
		int targetArr[] = new int [nums.length];

		for (int i=0; i<nums.length; i++) {
			int ind = index[i];
			int num =nums[i];
			if(ind<i) {
				for (int k=targetArr.length-2; k>=ind; k--) {
					System.out.println(targetArr[k]);
					targetArr[k+1]=targetArr[k];
				}
			}
			targetArr[ind]=num;
		}
		
		return targetArr;
//		System.out.println("targetArray length is "+ targetArr.length);
//		for (int i=0; i<targetArr.length;i++) {
//			System.out.println(targetArr[i]);
//		}
	}
}
