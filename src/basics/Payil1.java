package basics;

public class Payil1 {
	int first=-1;
	int second=1;
	int third;
	int div;
	void fib(int num) {
		third=first+second;
		System.out.print(third+" ");
		first=second;
		second=third;
		
		if(num>0) {
			fib(num-1);}
	}
	public static void main(String[] args) {
		Payil1 f=new Payil1();
		f.fib(15);
	}

}
