package stringProblems;

public class PrintFrequencyofString {
	
	static int alphabets = 26;
	public static void main (String args[]) {
		
		
		String str="geeksforgeeks";
		int count[]=new int [alphabets];
		
		for (int i=0; i<str.length();i++) {
//			System.out.println(str.charAt(i)-'a');
			count[str.charAt(i)-'a']++;
		}
		System.out.println("count array length is "+count.length);
//		System.out.println(count[str.charAt(4)+'a'] + " - " + count[4]);
		for (int i=0; i<count.length;i++) {
			if (count[i]!=0) {
//				System.out.println(count[i]);
				System.out.println((char)(i+'a') + " - "+count[i]);
			}
		}
		
	}

}
