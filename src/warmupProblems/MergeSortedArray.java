package warmupProblems;

public class MergeSortedArray {

	public static void main(String[] args) {

		int nums1[]= {1,2,3,0,0,0};
		int nums2[]= {2,5,6};
		merge(nums1, nums1.length, nums2, nums2.length);
	}
	
	public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
		
		int max=nums2[0];
		int j=0;
		int i=0;
		while (i <m) {
			if (nums1[i]>= nums2[j]) {
				max=nums1[i];
			} else {
				max=nums2[j];
			}
			int d=n+i-1;
			for(int k=n+i-1; k>=i+1; k--) {
//				System.out.println(nums1[j]);
				nums1[k+1]= nums1[k];
			}
			nums1[i+1]=max;
		 i++;
		 j++;
		}
		return nums2;
	}

}


//int temp=nums1[i];
//nums1[i]=max;
//max= temp;