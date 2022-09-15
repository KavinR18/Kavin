package basics;

public class Sumofnumberstosingledigit {

	public static void main(String[] args) {
		int n = 834451;
		int a, sum = 0, b;
		while (n > 0) {
			a = n % 10;
			sum = sum + a;
			n = n / 10;
		System.out.println(sum);
			if (sum > 9) {
				b = sum % 10;
				sum = sum / 10;
				sum = sum + b;
			}

		}
		System.out.println(sum);
	}
}