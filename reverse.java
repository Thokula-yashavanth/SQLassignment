package javatraining;

public class reverse{
	
	public static void main(String[] args) {
		
		int array[]= {1,2,3,4,5};
		
		System.out.println(" Right order array elements:");
		for(int i=0;i<array.length;i++) {
		System.out.println(array[i]+"");
		}
		
		System.out.println("reverse order array elements:");
		for(int i=array.length-1;i>=0;i--) {
			System.out.println(array[i]+"");
		}
	}
}


