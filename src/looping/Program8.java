package looping;

public class Program8 {

	public static void main(String[] args) {
		int n=17;
		int div=2;
		int count=0;
		while(div<n) {
			if(n%div==0) {
				count=count+1;
		}
				div=div+1;
		}
		if(count==0)
			System.out.println("prime number");
		else
			System.out.println("Not a prime number");
	}

	}


