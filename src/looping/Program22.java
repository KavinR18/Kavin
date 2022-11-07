package looping;

public class Program22 {

	public static void main(String[] args) {
		int n=12321;
		int n1=n;
		int rev=0;
		while(n>0) {
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(rev==n1)
			System.out.println("palindrome number");
		else
			System.out.println("not palindrome number");

	}

}
