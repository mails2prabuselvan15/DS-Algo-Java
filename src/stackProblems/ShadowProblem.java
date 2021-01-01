package stackProblems;

import java.util.Stack;

public class ShadowProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {100, 80, 60,70,60,75,85};
		int[] findShadow = findShadowusingStack(arr);
		for (int i=0;i<findShadow.length;i++) {
			System.out.println(findShadow[i]);
		}
	}

//	O(n2) solution
	public static int[] findShadow(int arr[]) {
		int len=arr.length-1;
		int count;
		int k=0;
		int temp[]= new int[arr.length];
		for(int i=len;i>=0;i--) {
			count=1;
			for (int j=i-1; j>=0;j--) {
//				System.out.println("arr[j] "+ arr[j]);
				if (arr[i]>= arr[j]) {
					count++;
				}else { 
					break;
				}
			}
			temp[k] = count;
			k++;			
		}
		return temp;
	}
	
//	Using Stack 
	public static int[] findShadowusingStack(int arr[]) {		
		int len=arr.length-1;
		int top=-1;
		Stack<Integer> mainStk = new Stack<Integer>();
		int temp[] = new int [arr.length];
		int res =0;
		for (int currentIndex=0;currentIndex<len; currentIndex++) {	
			if(top==-1) {
				mainStk.push(arr[currentIndex]);
				res= currentIndex-(top);
				top++;
			}else if (mainStk.peek()>=arr[currentIndex]) {
				mainStk.push(arr[currentIndex]);
				res= currentIndex - (top);
				top++;
			} else  {
				while(mainStk.peek()<arr[currentIndex]) {
					int  pop = mainStk.pop();
					top--;
				}
				res=currentIndex-(top);
				mainStk.push(arr[currentIndex]);
				top++;	
			}
			temp[currentIndex]=res;
		}
		return temp;	
	}
}
