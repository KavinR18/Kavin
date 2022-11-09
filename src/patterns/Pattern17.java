package patterns;

public class Pattern17 {

	public static void main(String[] args) {
		for(int row=1;row<=5;row++) {
			for(int star=1;star<row;star++) {
				System.out.print(" "); 
			}
			for(int col=1;col<=6-row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}

}
