package looping;

public class Program25 {

	public static void main(String[] args) {
		int n=123;
		int sum=0;
		int product=1;
		while(n>0) {
			int rem=n%10;
		sum=sum+rem;
		product=product*rem;
			n=n/10;
	}
	if(sum==product)
		System.out.println("spy number");

}
}