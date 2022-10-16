package basics;

public class Child extends Parent{
	void delete() {
		System.out.println("Data refining");
	}

	public static void main(String[] args) {
	Child c=new Child();
	c.data();		
	}

}
