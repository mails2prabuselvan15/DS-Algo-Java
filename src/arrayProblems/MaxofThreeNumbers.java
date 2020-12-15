package arrayProblems;

public class MaxofThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int nums[]= {1,2,3,4,5,6};
//		int nums[]= {1,2,3,4};
//		int nums[]= {-1,-2,-3};
		
		int nums[]= {-100,-98,-1,2,3,4};
		int max3num = max3num(nums);
		System.out.println(max3num);
	}

	public static int max3num(int nums[]) {
		
		int len=nums.length;
		int n=3;
		int max=Integer.MIN_VALUE;
		for (int i=0;i<len-n+1; i++) {
			int temp=1;
			for (int j=i; j<n+i; j++) {
				temp*=nums[j];
			}
			max=Math.max(temp, max);
		}
		return max;
	}
}
