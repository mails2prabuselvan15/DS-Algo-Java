package arrayProblems;

public class ArrayZigZag {
	
	public static void main(String[] args) {
		int arr[]= {4,3,7,8,6,2,1};
		int[] zigZag = zigZag(arr);
		
		for(int i=0; i<zigZag.length; i++) {
			System.out.println(zigZag[i]);
		}
		
	}
	
	public static int[] zigZag (int arr[]) {
	
			boolean flag= true;
			int temp=0;
			for(int i=1; i<arr.length; i++) {
				if (arr[i]< arr[i-1] && flag==true) {
					int min = Math.min(arr[i], arr[i-1]);
					 temp=min;
					 arr[i]=arr[i-1];
					 arr[i-1]=temp;
					 flag=false;
			
				} else if(arr[i]> arr[i-1] && flag== false) {
					int max = Math.max(arr[i], arr[i-1]);
					temp=max;
					 arr[i]=arr[i-1];
					 arr[i-1]=temp;
					 flag=true;
					
				}else {
					flag=!flag;
				}
			}
		return arr;
	}

//	public static void swap(int a, int b) {
//		int temp= a;
//		a=b;
//		b=temp;
//	}
}
