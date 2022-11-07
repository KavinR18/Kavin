package looping;

public class Program9 {

	public static void main(String[] args) {
		int n1=100;
		int n2=120;
		int div=2;
		int small=n1<n2?n1:n2;
		while(div<small) {
			if(n1%div==0 &&n2%div==0) 
				System.out.println(div);
				div=div+1;
		}
	}

	}

