package basics;

public class GreenParrot extends Parrot {
	int a=6;
	void color() {
		int a=5;
		
		System.out.println(a+" "+this.a+" "+super.a);
		
		
		System.out.println("Green");
	}

}
