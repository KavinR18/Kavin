package looping;

public class Program15 {

	public static void main(String[] args) {
		int n=1;
		while(n<=100) {
			int div=2;
			int count=0;
			while(div<n) {
				if(n%div==0)
				{
					count=count+1;
				}
				div=div+1;	
			}
			if(count==0)
				System.out.println("prime "+n);
			n=n+1;
		}
	}

}
