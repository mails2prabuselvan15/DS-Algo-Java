package searching;

public class DuplicatesinSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {0,0,0,0,0,1,1};
		
		int low=0;
		int high=arr.length-1;
		
//		int findDup = findDup(arr,  low,  high);
		int findDup = findDup1(arr,  high);
		System.out.println("Duplicate count is "+findDup);
	}
	
	public static int findDup(int arr[],int  low, int high) {   
		int len=high;
		while(low<=high) {
			int mid=(low+high)/2;
			System.out.println("Mid value "+  arr[mid]);
			if (arr[mid]==1 && arr[mid-1]!=1) {
				return (len-mid)+1;
			}  else if(arr[mid]!=1) {
				low=mid+1;
			} else if (arr[mid]==1 && arr[mid-1]==1) {
				high=mid-1;
			}
			
		}
		return -1;
	}




public static  int  findDup1(int arr[], int n) {
	int count=0;
	for (int i=n;i>=0; i--) {
		if (arr[i]==1) {
			count++;
		} else {
			break;
		}
	}
	return count;
  }
}