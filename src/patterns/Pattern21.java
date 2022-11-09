package patterns;

public class Pattern21 {

	public static void main(String[] args) {
		for(int row=1;row<=10;row++) {
			for(int star=1;star<=row;star++) {
                if(row>=5?star<=10-row:star<=5) {
	              
	               System.out.print("* ");}

			}
			
			System.out.println();
	}

	}
}
