package patterns;

public class Name {
	void K() {
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
		System.out.println();
	}
void A() {
	for(int row=1;row<=8;row++)
	{
		for(int star=1;star<=5;star++) {
			if(row==1 || row==5 || star==1 || star==5)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
	System.out.println();
}
void V()
{
	for(int row=1;row<=5;row++) {
		for(int star=1;star<=10;star++) {
			if(row==star || row+star==10)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	}
	System.out.println();
}
	void I() {
		for(int row=1;row<=7;row++) {
			for(int star=1;star<=5;star++) {
				if(row==1 || row==7||star==3)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
	}
	void N() {
		for(int row=1;row<=9;row++) {
			for(int star=1;star<=10;star++) {
				if(star==1 ||star==10 || row==star)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void main(String[] args) {

		Name KAVIN=new Name();
		KAVIN.K();
		KAVIN.A();
		KAVIN.V();
		KAVIN.I();
		KAVIN.N();
	}
	}
