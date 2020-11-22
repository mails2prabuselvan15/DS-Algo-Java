package stringProblems;

public class Compareto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "geeksforgeeks";
		String str2=  "her";
		
		int res = str1.compareTo(str2);
		
		if(res==0) {
			System.out.println("same");
		} else if(res>0) {
			System.out.println("S1 is greater");
		} else if(res < 0) {
			System.out.println("S1 is Smaller");
		}
	}

}
