package warmupProblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MajorityOfAnElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int arr[]= {2,2,1,1,1,2,2};
//		int arr[] = {3,2,3};
//		int arr[]= {1};
		int arr[] = { 2,2,1,3,1,1,4,1,1,5,1,1,6};
		
		int majority = majority(arr);

		System.out.println(majority);
	}

	public static int  majority(int arr[]) {
//		int maxCnt= arr.length / 2;
		int count;
		HashMap<Integer, Integer> hashmap=  new HashMap<Integer, Integer>();
		for (int i=0; i<arr.length; i++) {
			count=1;
			if(arr.length==1) {
				hashmap.put(arr[i], count);
			}
			if(!hashmap.containsKey(arr[i])) {
				for (int j=i+1; j<arr.length; j++) {
					if(arr[i]==arr[j]) {
						count=count+1;
						hashmap.put(arr[i],count);
					
					}
				}
			}		
		}
		
	Set<Integer> keySet = hashmap.keySet();
		
	int res=0;
	int mainkey=0;
		for ( Integer key : keySet) {
			System.out.println("Key is "+key);
			if (hashmap.get(key)  > res) {
				res=hashmap.get(key);
				mainkey=key;
			}
		}

//		System.out.println("res value is " + res);
		System.out.println(mainkey);
//		return hashmap.get(res);
		
		return res;
		
	}
}
