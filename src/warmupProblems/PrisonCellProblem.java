package warmupProblems;

public class PrisonCellProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int arr[]= {0,1,0,1,1,0,0,1};
		
		int arr[]= {1,0,0,1,0,0,1,0};
		int numberOfDays = 1000000000;
		
		
//		int[] prisonCell = prisonCell(arr, numberOfDays);
		
		int[] prisonCell = prisonCellusingXOR(arr, numberOfDays);
		
		for(int i=0; i<prisonCell.length; i++) {
			System.out.println(prisonCell[i]);
		}
		
	}
	
	/**
	 * @param arr
	 * @return
	 */
	public static int[] prisonCell(int arr[] , int numberOfDays) {
		
		int n =arr.length;
		int newArr[]= new int[n];
		newArr[0]=0;
		newArr[n-1]=0;	
		for (int i=1;i<=numberOfDays; i++ ) {
			for (int j=1; j<n-1; j++) {
				if( (arr[j-1] == 1 && arr[j+1]==1) || (arr[j-1] ==0 && arr[j+1] ==0)) {
					newArr[j] = 1;
				} else {
					newArr[j]=0;
				}
			}
			for (int k=0; k<newArr.length; k++) {
				arr[k]=newArr[k];
			}
		}	
	return arr;
	
	}

	public static int[] prisonCellusingXOR(int arr[], int numberOfDays) {
		
		int n =arr.length;
		int newArr[]= new int[n];
		newArr[0]=0;
		newArr[n-1]=0;	
		for (int i=1;i<=numberOfDays; i++ ) {
			for (int j=1; j<n-1; j++) {
				int prev = arr[j-1];
				int next=arr[j+1];
				if((prev ^ next)== 0 ) {
					newArr[j] = 1;
				} else {
					newArr[j]=0;
				}
			}
			for (int k=0; k<newArr.length; k++) {
				arr[k]=newArr[k];
			}
		}	
		return arr;	
	}
}

//{0,1,1,0,0,0,0,0}
