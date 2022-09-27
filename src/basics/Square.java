package basics;

public class Square {
	int a;
	void area() {
		System.out.println(a*a);
	}

	public static void main(String args[])
	{
		Square s1=new Square();
		Square s2=new  Square();
		s1.a=5;
		s2.a=10;
		s1.area();
		s2.area();
			}
}
