package warmupProblems;

public class XOROperationsinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int xor = XOR(10,5);
		System.out.println(xor);
	}

	public static int XOR(int n, int start) {
		int nums[] =new int[n];
		int temp = 0;
		int res=0;
		for(int i=0; i<n ; i++) {
			temp= start + 2 * i;
			nums[i]=temp;
			res^=nums[i];
		}
		return res;
	}
}
