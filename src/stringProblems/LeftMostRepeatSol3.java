package stringProblems;

public class LeftMostRepeatSol3 {
	static int CHAR=256;
	
	public static void main(String args[]) {
		
//		String str = "geeksforgeeks";
		String str = "abbccd";
		
		int leftmost = leftmost(str);
		System.out.println("left most character is "+ leftmost);
	}

	static int leftmost(String str) {
		boolean[] visited=  new boolean[CHAR];
		int res=-1;
		for(int i=str.length()-1;i>=0;i--) {
			if(visited[str.charAt(i)]) {
				res=i;
			} else {
				visited[str.charAt(i)]=true;
			}
		}
		return res;
	}
}
