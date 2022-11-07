package looping;

public class Program26 {

	public static void main(String[] args) {
		int n=496;
		int n1=n;
		int div=1;
		int perfect=0;
		while(div<n) {
			if(n%div==0)
				perfect=perfect+div;
			div=div+1;
		}
		if(perfect==n1)
			System.out.println("perfect number");
	}

}
