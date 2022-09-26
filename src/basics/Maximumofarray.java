package basics;

public class Maximumofarray {

	public static void main(String[] args) {
		int a[] = { 35, 53, 12, 42, 83, 70 };
		int max = a[0];
		int b = 0	;
		

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
				b = i;

			}
		}
			System.out.println(max);
			

				


		System.out.println(b);
		

	}
}