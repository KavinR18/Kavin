package patterns;

public class Pattern16 {

	public static void main(String[] args) {
		for(char row='A';row<=70;row++) {
			for(char star=1;star<=70-row;star++) {
				System.out.print(" "); 
			}
			for(char col='A';col<=row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}

}
