package warmupProblems;

import java.util.Arrays;

public class ShuffleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "codeleet";
		int indices[] = {4,5,6,7,0,2,1,3};
		
		restoreString(s, indices);
	}
	
	public static void restoreString(String s, int[] indices) {
        
//	      Arrays.sort(indices);
		char[] str = new char[s.length()];
	       for (int i=0; i<indices.length;i ++) {
	    	   System.out.println(indices[i]);
	    	   System.out.println(s.charAt(i));
	    	   str[indices[i]] = s.charAt(i);
	       }
	       
	      System.out.println(String.valueOf(str));
	       
	}
}
