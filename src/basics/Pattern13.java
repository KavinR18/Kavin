package basics;

public class Pattern13 {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i <= n; i++) {
			for (int j = n; j >= i; j--) {

				System.out.print(" ");
			}
			for (i = 0; i <= n; i++) {
				for (int j = i; j <= n; j++) {
					System.out.print(" ");

				}
				for (int j = 1; j <= i; j++) {
					if (j == 1 || j == i)
						System.out.print(" *");
					else
						System.out.print("  ");
				}
				System.out.println();
			}

		}
		for (int i=0;i<=n;i++)
		{
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
