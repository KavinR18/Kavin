package patterns;

public class Pattern24 {

	public static void main(String[] args) {
		for(int row=1;row<=8;row++) {
			for(int star=1;star<=5;star++) {
				if(star==1)
					System.out.print("* ");
				else if(row<=4 && row+star==6)
					System.out.print("* ");
				else if(row>=5 && row-star==3)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
