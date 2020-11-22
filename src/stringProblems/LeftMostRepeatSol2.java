package stringProblems;

public class LeftMostRepeatSol2 {

	static int CHAR=256;
	public static void main(String args[]) {
		
//		String str = "geeksforgeeks";
//		String str = "abbcc";
		String str = "abcd";
		int leftmostRepeat = leftmostRepeat(str);
		System.out.println(leftmostRepeat);
		
	}
	
	static int leftmostRepeat(String str) {
		
		int count[]= new int[CHAR];
		
		for (int i=0;i< str.length();i++) {
			count[str.charAt(i)]++;
		}
		
		for(int i=0;i <str.length();i++) {
			if(count[str.charAt(i)]>1) {
				return i;
			}
		}
		return -1;
	}
}
