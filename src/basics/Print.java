package basics;

public class Print {
	int n=2;
	void m1() {
		System.out.println(n);
		n++;
		if(n<=5) {
			m1();
		}
			System.out.println(n);
		
	}

	public static void main(String[] args) {
		Print p=new Print();
		p.m1();
		
		
	}

}
