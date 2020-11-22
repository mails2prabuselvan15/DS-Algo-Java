package stringProblems;

public class LeftMostRepeatSol1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String str="geeksforgeeks";
//		String str="abbcc";
		String str="abcd";
		
		int leftRepeat = leftRepeat(str);
		System.out.println("left Repeating characters are "+ leftRepeat);

	}
	
	static int leftRepeat(String str) {
		for (int i=0; i<str.length();i++) {
			char charAt1 = str.charAt(i);
			for(int j=i+1; j<str.length();j++) {
				char charAt2 = str.charAt(j);
				if(charAt1==charAt2) {
					return i;
			
				}
			}
				
		}
		return -1;
	}

}
