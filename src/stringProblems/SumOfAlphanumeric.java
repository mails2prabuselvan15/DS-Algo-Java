package stringProblems;

public class SumOfAlphanumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String str= "1abc23";
//		String str="geeks4geeks";
//		String str="1abc2x30yz67";
		String str ="123abc";

		int temp = 0, num=0,  num2=0;
		String temp1="";
		
		
		for(int i=0; i<str.length();i++) {
			char charAt = str.charAt(i);
			
//			num=(int)charAt;
			num=Character.getNumericValue(charAt);
			System.out.println("Num conversion is "+ num);
			if(charAt>=65 && charAt<=122) {
				continue;
			} else {
				if(i==0) {
					
				}else if(i!=str.length()) {
					char charAt2 = str.charAt(i+1);
					if(charAt2>=65 && charAt2<=122) {	
						temp+=num;
						continue;
					} else {
						num2=Character.getNumericValue(charAt2);
						String string1 = Integer.toString(num);
						String string2 = Integer.toString(num2);
						temp1=string1.concat(string2);
						int parseInt = Integer.parseInt(temp1);
						temp+=parseInt;
						i++;
						continue;
					}
				}
				temp+=num;
			}
			
		}
		System.out.println(temp);
	}

}
