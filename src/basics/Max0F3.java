package basics;

public class Max0F3 {
	int max(int a, int b, int c) {
		if (a >= b && a >= c) {
			return a;
		} else if (b >= c) {
			return b;
		} else
			return c;

	}

	public static void main(String[] args) {
		Max0F3 a = new Max0F3();
		int m = a.max(10, 53, 32);
		int n = a.max(555, 66, 111);
		System.out.println(m);
		System.out.println(n);
	}

}
