package array;

public class HighestValue {

	public static void main(String[] args) {
int[] ar= {-32,43,52,-68,98,65,46};
int big=Integer.MIN_VALUE;
		
		for(int i=0;i<ar.length;i++) {
            if(big<ar[i])
			big=ar[i];
			
		}
		System.out.println("Highest value is "+big);
		
	}

}
