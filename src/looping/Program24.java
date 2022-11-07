package looping;

public class Program24 {

	public static void main(String[] args) {
		int n=81;
		int n1=n;
		int sum=0;
		int neon=0;
		while(n>0) {
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		neon=sum*sum;
		if(neon==n1)
			System.out.println("neon number");
	}

}
