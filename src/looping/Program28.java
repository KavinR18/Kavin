package looping;

public class Program28 {

	public static void main(String[] args) {
		int n=49;
		int div=2;
		while(div<n) {
			if(n%div==0) {
				System.out.println("smallest divisor is "+div);
			break;
	     }
			div=div+1;
		}
	}

}
