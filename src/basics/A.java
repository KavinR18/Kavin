package basics;

public class A {
	int reverse(int n) {
		int rev=0,a=0;
		while(n>0){
			a=n%10;
			rev=rev*10+a;
			n=n/10;		
		}
		return rev;
	}

	public static void main(String[] args) {
		A a1=new A();
		 int q=a1.reverse(124141);
				
				
			System.out.println(q);	
				
				
				
				
				
	}
}
