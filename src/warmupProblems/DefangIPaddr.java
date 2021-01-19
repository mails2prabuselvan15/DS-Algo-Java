package warmupProblems;

public class DefangIPaddr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String address = "1.1.1.1";
		String address = "255.100.50.0";
		defangIPaddr(address);
	}
	
	 public static void defangIPaddr(String address) {
	        
		 String temp = "";
	        for (int i=0; i<address.length(); i++) {
	        	char charAt = address.charAt(i);
	        	if (charAt=='.') {
	        		temp+="["+charAt+"]";
	        	} else {
	        		temp+=charAt;
	        	}
	        }
	        System.out.println("temp value is "+temp);
	    }

}
