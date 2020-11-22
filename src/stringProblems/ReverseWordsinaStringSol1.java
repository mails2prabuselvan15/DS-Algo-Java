package stringProblems;

public class ReverseWordsinaStringSol1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "Welcome to Gfg";
//		String str= "I Love Coding";
//		String str= "abc";
		String temp= "";
		String[] split = str.split(" ");
		if (split.length==0) {
			temp=str;
		}
		for (int i=split.length-1; i>=0; i--) {
//			System.out.println(split[i]);
			temp+=split[i]+" ";
		}
		
		System.out.println("After Reverse "+temp);

	}

}
