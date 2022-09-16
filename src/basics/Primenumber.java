package basics;

public class Primenumber {

	public static void main(String[] args) {
		int n=8;
		int c=0;
		for(int i=2;i<n;i++)
               if(n%i==0) {
            	  c++ ;
               }
		if(c==0) {
			System.out.println(n+ " is  prime number");
		}
	  else
		  System.out.println(n+ " is not prime number");
		  
		  
	}
}
