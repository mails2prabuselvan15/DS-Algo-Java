package warmupProblems;

public class EvenNumDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int arr[] = {12,345,2,6,7896};
		int arr[]= {555,901,482,1771};
		
		int evenDigits = evenDigits(arr);
		System.out.println(evenDigits);
	}
	
	public static int evenDigits(int nums[]) {	
		int res=0;
		for (int i=0;i < nums.length; i++) {
			
			int curr =nums[i];
			int count=1;
			int temp= curr/ 10;
			while (temp>0) {
				count++;
				temp=temp/10;
			}
			if (count%2==0) {
				res++;
			}
		}
	return res;
	}

}
