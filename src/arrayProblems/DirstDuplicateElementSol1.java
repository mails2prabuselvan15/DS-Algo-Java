package arrayProblems;

public class DirstDuplicateElementSol1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int arr[]= {1, 2, 4, 4, 1, 3, 7, 5, 5, 2};
//		int arr[] = {1, 5, 3, 4, 3, 5, 6};
//		int arr[]= {1,2,3,4};
		int arr[]= {1,1,2,2,3,3};
		
		int findDup1 = findDup1(arr);
		System.out.println(findDup1);
	}
	
	static int findDup1(int arr[]) {
		for (int i=0; i<arr.length;i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]==arr[j]) return i+1;
			}
		}
	return -1;
	}

}
