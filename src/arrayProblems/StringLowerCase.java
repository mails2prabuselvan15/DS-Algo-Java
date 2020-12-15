package arrayProblems;

public class StringLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "LOVELY";
		String lowerCase = lowerCase(str);
		System.out.println(lowerCase);
	}

	public static String lowerCase(String str) {
//		String test= "";
		for(int i=0; i<str.length(); i++) {
			char charAt = str.charAt(i);
			int ascii = (int) charAt;
			if (ascii>=65 && ascii<=90) {
				int small =ascii + 32;
				char temp =(char) small;
				str=str.replace(charAt, temp);
			}else {
				str=str.replace(charAt, charAt);
			}	
		}
		return str;	
	}
}
