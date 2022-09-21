package basics;

public class Pattern9 {

	public static void main(String[] args) {
		char i ='A';
		for (int j=1;j<=4;j++) {
			for (int k=1;k<=4;k++) {
				
				if(j==k) {
				System.out.print(i++);}
				else
					System.out.print("  ");
			
		}
             System.out.println();
	}

}
}