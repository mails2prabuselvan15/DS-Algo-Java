package algoDaily;

public class DollarSignDeletion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] str=  { "f$st", "st"} ;
		
		boolean compareTwo = compareTwo(str[0], str[1]);
		
		System.out.println(" After removing dollar sign "+ compareTwo);
		
//		String test= "prabu";
		
		
	}
	
	public static boolean compareTwo (String S1, String S2) {
		int temp =0;
		String test= "";
		
		for (int i=0; i<S1.length(); i++) {
			char ch1 = S1.charAt(i);
			if (ch1 == '$') {
				temp=i;
				break;
			}
		}
		
		for(int i=temp+1;i<S1.length();i++) { 
			char ch2 = S1.charAt(i);
			test+=ch2;
		}
		
		
		return test.equals(S2);
		
//		return false;
		
	}

}
