package basics;

public class Recursion2 {
	int n1=-1;
	int n2=1;

	void fib(int n)
	{
		
		int n3;
	
		  n3=n1+n2;
		System.out.print(n3+ " ");
		
		n1=n2;
		n2=n3;
		if(n>0)
		{
			n--;
			fib(n);
		}
	
	}
	public static void main(String[] args) {
		Recursion2 R=new Recursion2();
	
		R.fib(10);

}
}