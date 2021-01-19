package warmupProblems;

public class CountMatches {

	public static void main(String[] args) {
	
		int count =14;
		tournament(count);

	}
	
	public static void tournament(int count) {

		int temp=0;
		int div=0;
		while(count/2!=0) {
			 div = count/2;
			temp+=div;
			if(count%2==0) {
				count=div;
			} else {
				count= div +1;
			}
			
		}
		System.out.println(temp);
	}

}
