package arrayProblems;

public class Leaders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int arr[]= {16,17,4,3,5,2};
//		findLeaders(arr, arr.length);
		int arr[]= {100,200,300,400,500};
//		findMax1(arr, arr.length);
		findMax2(arr, arr.length);
	}

	public static void findLeaders(int arr[], int n) {
		for (int i=0; i<n; i++) {
			boolean flag=false;
			for (int j=i+1; j<n; j++) {
				if (arr[j] > arr[i]) {	
					flag=true;
					break;					
				}	
			}
			if(flag==false) {
				System.out.println(arr[i]);
			}
		
		}
	}
	public static void findLeadersone(int arr[], int n) {
		int res=1;
		for (int i=0;i<n;i++) {
			if (arr[i]> arr[res]) {
				System.out.println(arr[i]);
				res=i;
			}
		}
	}
	
//	First Solution
	
	public static void findMax1(int arr[], int n) {

			for(int i=0; i<n;i++) {
				boolean flag = true;
				for (int j=0; j<n; j++) {
					if (arr[i] < arr[j] ) {
						flag=false;
						break;
					}
				}
			if (flag==true) {
				System.out.println(arr[i]);
			}
			}
	}
	
// Second solution
	
	public static void findMax2(int arr[], int n) {
		int res=0;
		for (int i=1; i < n; i++) {
			if(arr[i]> arr[res]) {
				res=i;
			}
		}
		System.out.println(arr[res]);
	}
	
	
}
