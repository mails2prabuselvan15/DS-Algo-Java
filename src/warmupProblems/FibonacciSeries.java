package warmupProblems;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val=1;
		int findVal = findVal(val);
		System.out.println(findVal);
	}
	public static int findVal(int n) {
		int n1=0;
		int n2=1;
		int n3=0;
		int i=2;
		while(i<=n) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			i++;
		}
		if(n==1) {
			n3=1;
		}
	return n3;
	}
}
