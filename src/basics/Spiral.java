package basics;

public class Spiral {

	public static void main(String[] args) {
		int n = 4;
		int i = 0;
		int j = 1;

		for (i = 1; i <= n; i++) {
			System.out.print(j + " ");
			j++;
		}

		System.out.println();
		j = 1;
		for (i = 1; i <= n; i++) {
			if (i == 1)
				System.out.print(++j + " ");
			else if (i == n)
				System.out.print(++j + " ");
			else
				System.out.print("  ");
		}
		System.out.println();
		for (i = 1; i <= n; i++) {
			if (i == 1)
				System.out.print(j + " ");
			else if (i == n)
				System.out.print(--j + " ");
			else
				System.out.print("  ");
		}
		System.out.println();
		for (i = n; i > 0; i--) {
			System.out.print(i + " ");
		}
	}
}