package looping;

public class Program7 {

	public static void main(String[] args) {
		int n=100;
		int div=2;
		int count=0;
		while(div<n) {
			if(n%div==0) {
				System.out.println(div);
				count=count+1;
			}
				div=div+1;
		}
	System.out.println(count);
	}
}
