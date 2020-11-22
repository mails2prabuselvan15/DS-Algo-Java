package stringProblems;

public class EqualsOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1= "geeksforgeeks";
//		String str2= "geeksforgeeks";
		String str2= new String("geeksforgeeks");
		
		if ( str1==str2) {
			System.out.println("References are Same");
		}else {
			System.out.println("Not Same");
		}
		
//		To compare the string content
		
		if(str1.equals(str2) ) {
			System.out.println("Content is same");
		}
		
		System.out.println(str1.contains("for"));
	}

}
