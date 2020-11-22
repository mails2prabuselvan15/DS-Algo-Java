package stringProblems;

public class ReverseWordsinaStringSol3 {

	public static void main(String args[]) {
		
		String str = "Welcome to gfg";
		
		char[] charArray = str.toCharArray();
		reverseWords(charArray);
		
		System.out.println("After Reverse "+ str);
		
		
	}
	
	static void reverseWords(char ch[]) {
		int start= 0;
		int n=ch.length;
		
		for(int end = 0; end <n; end++) {
			if (ch[end]==' ') {
				reverse(ch, start, end-1);
				start=end+1;
			}
		}
		reverse(ch, start, n-1);
		reverse(ch,0, n-1);
		
		
	}
	static void reverse(char ch[], int low, int high)  {
		char temp=' ';
		while (low<high) {
			temp = ch[low];
			ch[low]=ch[high];
			ch[high]=temp;
			low++;
			high--;
		}
		
	}
}
