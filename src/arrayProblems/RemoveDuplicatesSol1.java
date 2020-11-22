package arrayProblems;

public class RemoveDuplicatesSol1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {10,20,20,30,30,30,40};
		removeDup(arr);
		
	}

	static void removeDup(int arr[]) {
		
		int temp[]=new int[arr.length];
		temp[0]=arr[0];
		int res=1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=temp[res-1]) {
				temp[res]=arr[i];
				res++;
			}
		}
		
		for(int i=0;i<temp.length;i++) System.out.println(temp[i]);
		
		
//		for(int i=0;i<res;i++) {
//			arr[i]=temp[i];
//		}
//		for(int i=0; i<arr.length;i++) System.out.println(arr[i]);
	}
	
	
	static void removeDup2(int arr[]) {
		int res=1;
		for(int i=1; i<arr.length;i++) {
			if(arr[i]!=arr[res-1]) {
				arr[res]=arr[i];
				res++;
			}
		}
	}
}
