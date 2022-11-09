package patterns;

public class Pattern20 {

	public static void main(String[] args) {
		int num=1;
		while(num<=7) {
			for(int star=1;star<=num;star++) {
				System.out.print("* ");
			}
			num+=2;
			System.out.println();
		}
	}

}
