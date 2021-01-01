package algoDaily;

public class PalindromeDay5 {

	public static void main(String[] args) {
//		String str = "racecar";
		String str= "thisisnotapalindrome";
		
		reverse(str);
//		boolean palindrome = isPalindrome(str);
//		System.out.println("Palindome is "+ palindrome);
		
		String reverse2 = reverse2(str);
		
		System.out.println("After Reversing "+ reverse2);
	}
	
	public static boolean isPalindrome(String str) {
		int len=(str.length())/2;
		int totallen=str.length()-1;
		System.out.println("Half of length is "+ len);
		for (int i=0;i<len;i++) {
			char firstIndex = str.charAt(i);
			char secondIndex = str.charAt(totallen-i);
			System.out.println(firstIndex);
			System.out.println(secondIndex);
			if (firstIndex!=secondIndex) return false;
		}
		
		return true;
	}
	
	public static String reverse (String str) {
		
		int len=str.length()-1;
		String temp="";
		for (int i=len; i>=0; i--) {
			char charAt = str.charAt(i);
			temp+=charAt;
		}
		System.out.println("Temp value is "+temp );
		return temp;
		
	}
	
	public static String reverse2(String str) {
		char[] charArray = str.toCharArray();
		int len=charArray.length-1;
		int n=charArray.length-1;
		char temp ;
		for (int i=0; i<charArray.length;i++) {
			char first = charArray[i];
			char last = charArray[n-i];
			temp=charArray[i];
			charArray[i]=charArray[n-i];
			charArray[n-i]=temp;
		}
	
		String test = new String(charArray);
		System.out.println("test value is "+ test);
		return test;
	}

}
