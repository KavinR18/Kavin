package basics;

public class Recursion2 {
	

	void fib(int n, int n1,int n2)
	{
		
		int n3;
	
		  n3=n1+n2;
		System.out.print(n3+ " ");
		
	
		if(n>0)
		{
			n--;
			fib(n,n2,n3);
		}
	
	}
	public static void main(String[] args) {
		Recursion2 R=new Recursion2();
	
		R.fib(10,-1,1);

}
}