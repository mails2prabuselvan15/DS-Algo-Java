package warmupProblems;

public class ConsecutiveOdds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int arr[] = {2,6,4,1};
//		int arr[]= {1,2,34,3,4,5,7,23,12};
		
		
		System.out.println(find3odds(arr));

	}
	
	public static boolean find3odds(int arr[]) {
		
		int count =0 ;
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			if( ( arr[i] % 2 ) !=0 ) {
				count++;
				if (count==3) return true;
			} else {
				count=0;
			}
			
		}
		return false;
		
	}

}
