package patterns;

public class Pattern23 {

	public static void main(String[] args) {
		int no=1;
		for(int row=1;row<=5;row++) {
			for(int star=1;star<=row;star++) {
				System.out.print(no+" ");
				no++;
			}
			System.out.println();
		}
	}

}
