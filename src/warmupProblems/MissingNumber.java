package warmupProblems;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int arr[] = {3,0,1};
//		int arr[]= {0,1};
//		int arr[]= {9,6,4,2,3,5,7,0,1};
//		int arr[] = {1};
//		int arr[] = {0};
		
		int arr[]= {1,2};
		
		
		 int missingNum = missingNum(arr);
		
		 System.out.println("Missing Num "+ missingNum);

	}

	public static int missingNum(int nums[]) {
		Arrays.sort(nums);
		int temp=0;
		boolean flag= false;
		int val = 0;
		for (int i =val; i<nums.length;i++) {
			val=i;
			if (i!=nums[i]) {
				temp=i;
				flag=true;
				break;
			}
			
		}

		if (temp!=0 && nums.length==1 || temp ==0 && val <=nums.length && flag==true || temp!=0 && val == nums.length-1 && flag==true ) {
			return temp;
		}
		else if (temp==0 && val==nums.length-1) {
			temp= nums.length;
		} 
		return temp;
	}
}















