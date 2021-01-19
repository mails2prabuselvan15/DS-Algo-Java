package arrayProblems;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
//		int nums1[] = {1,2};
//		int nums2[] = {3,4};
		
//		int nums1[] = {0,0};
//		int nums2[] = {0,0};
		
//		int nums1[] = {};
//		int nums2[] = {1};
		
		int nums1[] = {2};
		int nums2[] = {};
		
		double median = median(nums1, nums2);

	}
	
	public static double median(int nums1[], int nums2[]) {
		int len =nums1.length + nums2.length;
		int value = 0;
		for (int i=0; i<nums1.length; i++) {
			value+=nums1[i];
		}
		for (int i=0; i<nums2.length; i++) {
			value+=nums2[i];
		}
		System.out.println("Value is "+ value);
		System.out.println("Len is "+ len);
		double temp =  (double) (value)/ (double) (len);
		return temp;
	}

}
