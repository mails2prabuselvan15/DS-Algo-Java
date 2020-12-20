package warmupProblems;

public class SmallerNumthanCurrentNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int arr[]= {8,1,2,2,3};
//		int arr[]= {6,5,4,8};
		int arr[] = {7,7,7,7};
		int[] smallerNum = smallerNum(arr);
		for (int i=0; i<smallerNum.length; i++) {
			System.out.println(smallerNum[i]);
		}
	}
	
	public static int[] smallerNum(int nums[]) {
		int temp[]=new int[nums.length];
		for(int i=0; i<nums.length; i++) {
			int count=0;
			for (int j=0; j<nums.length; j++) {
				if (i!=j) {
					if(nums[i]> nums[j]) {
						count++;
					}					
				}
			}
			temp[i]=count;
		}
		return temp;
	}
}
