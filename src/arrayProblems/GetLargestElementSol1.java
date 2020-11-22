package arrayProblems;

public class GetLargestElementSol1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,8,10,300,50};
		
//		int max = getMax(arr);
//		System.out.println("Max Element in the array is "+ max);
		
		int max=getMaxsol2(arr);
		System.out.println("Max Element is " + max);

	}
	
//	time complexity is O(n^2)

	static int getMax(int arr[]) {
		for(int i=0; i<arr.length;i++) {
			boolean flag =true;
			for(int j=0; j<arr.length;j++) {
				if(arr[j]>arr[i]) {
					flag=false;
					break;
				}
			}
			if(flag==true) {
				return arr[i];
			}
		}
		return -1;
	}
	
	static int getMaxsol2(int arr[]) {
		int res=0;
		for(int i=1;i <arr.length;i++) {
			if(arr[i]>arr[res]) {
				res=i;
			}
		}
		return arr[res];
	}
}
