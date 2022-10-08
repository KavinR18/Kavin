package basics;

public class B {
	void m1(int n)
	{
		System.out.println(n);
		n++;
		if(n<=5) {
			m1(n);
	}
	}
	public static void main(String[] args) {
		B b=new B();
		b.m1(1);
		
		
	}

}
