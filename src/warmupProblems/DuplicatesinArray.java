package warmupProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicatesinArray {

	public static void main(String[] args) {
		int arr[] = {4,3,2,7,8,2,3,1};
//		{1,2,2,3,3,4,7,8}
		
		List<Integer> findDup = findDup(arr);
		for (Integer el: findDup) {
			System.out.println(el);
		}
	}
	
	public static List<Integer> findDup(int arr[]) {
		List<Integer> list = new ArrayList<Integer>();
		Arrays.sort(arr);
		for (int i=1; i<arr.length; i++) {
			if(arr[i]== arr[i-1]) {
				list.add(arr[i]);
			}
		}	
		return list;
	}
}
