package basics;

public class Inheritance {

	public static void main(String[] args) {
		Parrot P=new Parrot();
		P.fly();
		P.speak();
		GreenParrot G=new GreenParrot();
		G.fly();
		G.speak();
		G.color();
	}

}
