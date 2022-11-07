package looping;

public class Program27 {

	public static void main(String[] args) {
		int n=225;
		int div=2;
		while(div<n) {
			if(n/div==div) {
				System.out.println("square root is "+div);
			break;
		}
			div=div+1;
		}
	}

}
