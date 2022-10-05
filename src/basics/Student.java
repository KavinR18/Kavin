package basics;

public class Student {
	int rollNo;
	String name;
	int mark;
	void display() {
		System.out.println(rollNo);
		System.out.println(name);
		System.out.println(mark);
		System.out.println();
	}

	public static void main(String[] args) {
		Student S1=new Student();
		S1.rollNo=18;
		S1.name="Kavin";
		S1.mark=477;
		S1.display();
		
		Student S2=new Student();
		S2.rollNo=17;
		S2.name="Siva";
		S2.mark=457;
		S2.display();
	
	
	}

}
