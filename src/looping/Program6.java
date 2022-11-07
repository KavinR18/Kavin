package looping;

public class Program6 {

	public static void main(String[] args) {
		int n=100;
		int div=2;
		while(div<n) {
			if(n%div==0) 
				System.out.println(div);
				div=div+1;
		}
	}

}
