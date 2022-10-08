package basics;

public class Factorial2 {
	int a=5;
	int fact=1;
	int i=1;
	void fact() {
		if(i<=a) {
			fact=fact*i;
			i++;
			fact();
		}

	}
	public static void main(String[] args) {
		Factorial2 F=new Factorial2();
		F.fact();
		System.out.println(F.fact);
	}

}
