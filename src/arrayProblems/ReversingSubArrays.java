package arrayProblems;

import java.util.HashMap;
import java.util.HashSet;

public class ReversingSubArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int target[] = {1,2,3,4}; 
//		int arr[] = {2,4,1,3};
		
//		int target[] = {1,2,2,3}; 
//		int arr[] = {1,1,2,3};
		
//		int target[] = {3,7,9}; 
//		int arr[] =    {3,7,11};
		
//		int target[] = {392, 360}; 
//		int arr[] =  {392, 360};
		
		int target[] = {809,107,274}; 
		int arr[] = {809,274,107};
		
		 boolean reverse = reverse(target, arr);
		 
		 System.out.println("Output is " + reverse); 
		
	}
	
	public static boolean reverse (int target[], int arr[]) {
		
//		boolean flag=false;
//		 for(int i=0; i<target.length;i++) {
//			 if (target[i]!=arr[i]) {
//				 flag=true;
//				 break;
//			 }
//		 }
//		
//		 if (flag==true) return false;
		 
		if(arr.length==1 && arr[0] == target[0]) return true;
        else if (arr.length==1 &&arr[0]!=target[0]) return false;
		
		boolean flag= false;
		for (int i=0;i<arr.length; i++) {
			if(arr[i]==target[i]) {
				flag=true;
			} else {
				flag=false;
				break;
			}
		}

		if (flag==true) return true;
		
		int low= 0;
		int high =arr.length-2;
		int [] rev = null;
		while(low<=high) {
			rev = rev(arr, low, high);
			low++;
			high--;
		}
		 rev = rev(rev, arr.length-2, arr.length-1);
		 for(int i=0; i<target.length;i++) {
			 if (target[i]!=rev[i]) return false;
		 }
		return true;
	}
	
	public static int[] rev(int temp[], int low, int high) {
		int low1= low;
		int high1=high;	
		while(low1<=high) {
			int val = temp[high1];
			temp[high1]= temp[low1];
			temp[low1]=val;
			low1++;
		}
		return temp;
	}
	

}
