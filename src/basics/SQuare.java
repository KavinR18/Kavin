package basics;

public class SQuare extends Shape{
	int side;
	void area() {
		System.out.println(side*side);
	}
	

	public static void main(String[] args) {
		SQuare s=new SQuare();
		s.side=6;
		s.area();
		
		
	}

}
