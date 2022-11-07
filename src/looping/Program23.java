package looping;

public class Program23 {

	public static void main(String[] args) {
		int n=153;
		int n1=n;
		int armstrong=0;
		while(n>0) {
			int rem=n%10;
			int power=rem*rem*rem;
			armstrong=armstrong+power;
			n=n/10;
		}
		if(n1==armstrong)
			System.out.println("armstrong");
			
	}

}
