package stringProblems;

import java.util.Arrays;

public class AnagramSol1 {

	public static void main(String[] args) {
		
		String str1 = "listen";
		String  str2= "silentr";
		
		boolean anagram = isAnagram(str1, str2);
		System.out.println("Output is "+anagram);
	}

	static boolean isAnagram(String str1, String str2) {
		if(str1.length()!= str2.length()) return false;
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
			
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		for (int i=0;i <charArray1.length; i++) {
			if(charArray1[i]!=charArray2[i]) return false;
		}
		return true;
	}
}
