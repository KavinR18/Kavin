package basics;

public class Recursion2 {

	public void fib(int n)
	{
		 int n1=-1;
		int n2=1;
		int n3=1,i=1;
	
		n3=n1+n2;
		System.out.print(n3+ " ");
		n1=n2;
		n2=n3;
		if(i<=n)
		{
			i++;
			fib(n-1);
		}
	
	}
	public static void main(String[] args) {
		Recursion2 R=new Recursion2();
	
		R.fib(10);

}
}