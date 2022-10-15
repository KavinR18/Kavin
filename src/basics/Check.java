package basics;

public class Check {
	void check(int a) {
		System.out.println("int "+a);
	}

	void check(byte a) {
		System.out.println("byte "+a);
	}

	
	void check(long a) {
		System.out.println("long "+a);
	}

	void check(char a) {
		System.out.println("char "+a);
	}

	void check(String a) {
		System.out.println("String "+a);
	}

	void check(double a) {
		System.out.println("double "+a);
	}

	void check(float a) {
		System.out.println("float "+a);
	}

	void check(boolean a) {
		System.out.println("boolean "+a);
	}

	void check(short a) {
		System.out.println("short "+a);
	}

	public static void main(String[] args) {
		byte b=9;
		short s=3423;
		long l=1343543434;
		Check C=new Check();
		C.check('a');
		C.check("A");
		C.check(b);
		C.check(true);
		C.check(93213153563.3653636253213);
		C.check(5656l);
		C.check(s);
		C.check(3871.1531);

	}

}
