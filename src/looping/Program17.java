package looping;

public class Program17 {

	public static void main(String[] args) {
		int n=1;
		int primeCount=0;
		while(true) {
			int div=2;
			int count=0;
			while(div<n) {
				if(n%div==0)
				{
					count=count+1;
				}
				div=div+1;	
			}
			if(count==0) {
				System.out.println(n);
            primeCount=primeCount+1;
    }
		if(primeCount==20) {
			break;
	}
		n=n+1;	
		}
}
}