package warmupProblems;

public class MoveZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {0,1,0,3,12};
		
//		int[] movingZeros = movingZeros(arr);
		int[] movingZeros = movingZeros1(arr);
		
		for (int i=0; i<movingZeros.length; i++) System.out.println(movingZeros[i]);
	}
	
	public static int[] movingZeros(int arr[]) {
		
		int temp=0;
		for (int i=0; i<arr.length; i++) {
			for (int j=i+1; j<arr.length; j++) {
				
				if (arr[i]==0 && arr[j] !=0  ) {
					temp= arr[i];
					arr[i]=  arr[j];
					arr[j]= temp;
					
				}
			}
		}
	return arr;
	}
	
	
//	 O(n) Solution
	
	public static int[] movingZeros1(int arr[]) {
		int count=0;
		for (int i=0;i <arr.length;i++) {
			if(arr[i]!=0) {
				int temp = arr[i];
				arr[i]= arr[count];
				arr[count] = temp;
				count++;
			}
		}
		return arr;
	}
	
 
}
