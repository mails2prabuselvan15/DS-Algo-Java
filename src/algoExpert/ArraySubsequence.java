package algoExpert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ArraySubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int arr[] = {5, 1, 22, 25, 6, -1, 8, 10};
//		int sub[]= {5, 1, 22, 22, 6, -1, 8, 10};
		
//		int arr[]= {5, 1, 22, 25, 6, -1, 8, 10};
//		int sub[] = {5, 1, 22, 25, 6, -1, 8, 10, 12};
		
//		int arr[] = {5, 1, 22, 25, 6, -1, 8, 10};
//		int sub[] = {1, 6, -1, 10};
		
//		int arr[] = {5, 1, 22, 25, 6, -1, 8, 10};
//		int sub[] = {1, 6, -1, -1};
		
//		int arr[]= {1, 1, 1, 1, 1};
//		int sub[] = {1, 1, 1 };
		
		int arr[] = {1,1,6,1};
		int sub[] = {1,1,1,6};
		
		boolean findSubsequence = findSubsequence(arr, sub);
		System.out.println("Find Subsequence is "+ findSubsequence);
		
		
		
//		List<Integer> l1= new ArrayList<Integer>();
//		l1.add(1);
//		l1.add(2);
//		l1.add(3);
//		l1.add(4);
//		
//		for (int i=0;i <l1.size();i ++) {
//			System.out.println(l1.get(i));
//		}
	}

	
	public static boolean findSubsequence(int arr[] , int sub[]) {

		
		int i=0;
		int len1=arr.length;
		int j=0;
		int len2=sub.length;
		
		boolean flag=false;
		
		if(len2> len1 ) return flag;
		
		while (j<len2 && i < len1) {
					if (i > j && i==len1-1) {
						return false;
					}else if (sub[j]!=arr[i]  ) {
						i++;
						flag=false;
					}else if(sub[j]==arr[i] )  {
						i++;
						j++;
						flag=true;
					}
		}
		
		return flag;
	}
}
