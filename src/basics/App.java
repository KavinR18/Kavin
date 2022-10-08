package basics;

public class App {


	void m1(int n) {
		System.out.println(n);
		n++;
		if(n<=5) {
			m1(n);
		}
			System.out.println(n);
		
	}

	
	public static void main(String[] args) {
		App A=new App();
		A.m1(1);
		
	}

}
