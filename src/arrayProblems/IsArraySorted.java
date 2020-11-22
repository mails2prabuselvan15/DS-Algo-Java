package arrayProblems;

public class IsArraySorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,4,5};
		System.out.println(isSorted(arr));
		
	}

	static boolean isSorted(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[i]) return false;
			}
  		}
	return true;
	}
	
	static boolean isSorted2(int arr[]) {
		int res=0;
		for(int i=1;i<arr.length;i++ ) {
			if(arr[i]<arr[res]) {
				return false;
			} else {
				res=i;
			}
		}
	return true;
	}
}
