package basics;

public class Largestofthreenumbers {

	public static void main(String[] args) {
		int a = 98, b = 98, c = 29;
		if (a >= b && a >= c) {
			System.out.println(a);
		} else if (b >= c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}
	}

}
