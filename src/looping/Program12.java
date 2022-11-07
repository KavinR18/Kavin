package looping;

public class Program12 {

	public static void main(String[] args) {
		int n=1234;
		int count=0;
		while(n>0) {
			System.out.println(n%10);
			n=n/10;
			count=count+1;
		}
		System.out.println();
		System.out.println(count);
	}

}
