package stackProblems;

public class Histogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int arr[]= {6,2,5,4,5,1,6};
		
		int arr[]= {2,1,5,6,2,3};
		
		int maxRectangularArea = maxRectangularArea(arr);
		System.out.println("Max Rectangular Area is "+ maxRectangularArea);
		
	}
	
	public static int  maxRectangularArea(int arr[]) {
		
		
		int max=0;
		int min=0;

	
		for (int i=0;i<arr.length;i++) {
			int temp=0;
			boolean flag=true;
			for (int j=0;j<arr.length;j++) {
				if (i!=j) {
					System.out.println("arr[i] "+arr[i]);
					System.out.println("arr[j] "+arr[j]);
					if (arr[i]<=arr[j] && flag==false) {
						min =arr[i];
						temp+=min; 
					} else if(arr[i]<=arr[j] && flag==true) {
						min =arr[i];
						temp+=min + min; 
						flag=false;
						
					} else if(arr[j]>=arr[i] && i>j) {
						temp=0;
						flag=true;
					} else if (arr[i]>=arr[j] && i> j) {
						temp=0;
						flag=true;
					}else if(arr[i]>=arr[j] && i <j) {
						break;
					}
					
				}	
			}
			if (temp > max) {
				max=temp;
			}
		}
	return max;
		
	}

}
