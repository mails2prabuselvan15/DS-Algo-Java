package warmupProblems;

import java.util.HashMap;
import java.util.HashSet;

public class JewelsAndStones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String J ="aA"; // Jewells
//		String S="aAAbbbb";  // Stones
		
		String J ="z";
		String S="ZZ";
		
		HashSet<Character> hmap = new HashSet<Character>();
		for(int i=0; i<J.length(); i++) {
			hmap.add(J.charAt(i));
		}
		
		int count= 0;
		for (int i=0; i<S.length(); i++) {
			char charAt = S.charAt(i);
			
			if(hmap.contains(charAt)) {
				count++;
			}
		}

	System.out.println(count);
	}

}
