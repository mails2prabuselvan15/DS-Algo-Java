package arrayProblems;

public class LinearSearchArrayOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=  new int [6];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		arr[5]=60;
		
		int x =30;
	

//		int x=100;
//		int pos=2;
//		int occupied=4;
//		int position = insert(arr, occupied,arr.length, pos, x);
//		for(int i=0; i<arr.length;i++) System.out.println(arr[i]);
		
//		int x=25;
//		int search = search(arr, x);
//		System.out.println(search);
		
		int delete = delete(arr, x);
		System.out.println("After delete "+delete);
	}
	
	static int insert(int arr[], int size, int totalcap,int pos, int x) {
		if(size==totalcap) return -1;
		int idx=pos-1;
		
		for (int i=size-1; i>=idx;i--) {
			arr[i+1]=arr[i];
		}
		arr[idx]=x;
		return (size+1) ;
	}
	
	static int search(int arr[], int x) {
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==x) {
				return i;
			}
		}
		return -1;
	}
	
	static int delete(int arr[], int x) {
		System.out.println("Before deelte is "+ arr.length);
		int temp=0;
		for (int i=0; i<arr.length;i++) {
			if(arr[i]==x) {
				temp=i;
				break;
			}
		}
		
//		System.out.println("Array length is "+arr.length );
		int len=arr.length-1;
		for(int j=temp; j<=len;j++) {
				arr[j]=arr[j+1];
		}
	return arr.length-1;
	}

}













