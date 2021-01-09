package warmupProblems;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {0,0,1,1,1,2,2,3,3,4};		
		removeDup(arr);
		
	}

	public static int removeDup(int arr[]) {
		int i=0;
		int j =i+1;
		int len=arr.length;
		int k=0;
		boolean flag=false;
		
		while (i< len) {
			System.out.println("arr[i] "+ arr[i]);
			System.out.println("arr[j] "+ arr[j]);
			if(arr[i]==arr[j] && flag==false) {
				arr[k]=arr[i];
				k++;
				j++;
				flag=true;
				
			}else if (arr[i]==arr[j] && flag==true) {
				i++;
				j++;
			}else  {
				j++;
				i+=2;
				flag=false;
			}
		
		}
		
		return 0;
		
	}
}
