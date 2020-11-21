package stringProblems;

public class AnagramSol2 {
	static int CHAR =256;

	public static void main(String[] args) {
		String str1= "listen";
		String str2= "silent";

		boolean anagram = isAnagram(str1, str2);
		System.out.println("Anagram is "+ anagram);
		
	}

	static boolean isAnagram(String str1, String str2) {
		if(str1.length()!= str2.length()) return false;
		int count[] = new int[CHAR];
		
		for (int  i=0; i<str1.length(); i++) {
			System.out.println(str1.charAt(i));
			count[str1.charAt(i)]++;
			count[str2.charAt(i)]--;
		}
			
		for (int i=0; i<count.length;i++) {
			if(count[i]!=0) return false;
		}
		return true;
	}
}


// Time complexity is O(n+ char)
// Space Complexity is O(n)