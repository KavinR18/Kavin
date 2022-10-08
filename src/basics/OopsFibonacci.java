package basics;

public class OopsFibonacci {
	int n1=-1;
	int n2=1;
	int n3,i=1,n=10;
	void fib()
	{
		n3=n1+n2;
		System.out.print(n3+ " ");
		n1=n2;
		n2=n3;
		if(i<=n)
		{
			i++;
			fib();
		}
	}
	
	
	
	public static void main(String[] args) {
		
		OopsFibonacci F=new OopsFibonacci();
		F.fib();
		
	}

}
