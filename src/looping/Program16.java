package looping;

public class Program16 {

	public static void main(String[] args) {
		int n=1;
		int primeCount=0;
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
            primeCount=primeCount+1;
			n=n+1;
	}
System.out.println(primeCount);
}
}