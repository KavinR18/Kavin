package looping;

public class Program11 {

	public static void main(String[] args) {
		int n=1234;
		while(n>0) {
			System.out.println(n%10);
			n=n/10;
		}
	}

}
