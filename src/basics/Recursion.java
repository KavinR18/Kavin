package basics;

public class Recursion {
	int n = 0;

	void m1() {
		System.out.println(n);
		n += 2;
		if (n <= 20) {
			m1();
		}
	}

	public static void main(String[] args) {
		Recursion R = new Recursion();
		R.m1();

	}

}
