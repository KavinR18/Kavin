package basics;

public class Factorial1 {
	int a;
	int fact = 1;
	int n1 = -1;
	int n2 = 1;
	int n3;

	void fact() {

		for (int i = 1; i <= a; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

	void fibo() {
		for (int i = 0; i < a; i++) {
			n3 = n1 + n2;
			System.out.print(n3 + " ");
			n1 = n2;
			n2 = n3;
		}
		System.out.println();
	}

	public static void main(String args[]) {
		Factorial1 F1 = new Factorial1();
		F1.a = 7;
		F1.fact();
		Factorial1 F2 = new Factorial1();
		F2.a = 5;
		F2.fact();
		F2.fibo();
		F1.fibo();

	}
}
