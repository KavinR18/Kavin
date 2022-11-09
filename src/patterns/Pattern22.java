package patterns;

public class Pattern22 {

	public static void main(String[] args) {
		for(int row=1;row<=5;row++) {
			int no=row;
			for(int star=1;star<=row;star++) {
				System.out.print(no+" ");
				no++;
			}
			System.out.println();
		}
	}

}
