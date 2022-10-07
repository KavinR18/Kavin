package basics;

public class Employee {
	int id;
	String name;
	Employee(int a,String S){
		System.out.println("Welcome");
		id=a;
		name=S;
	}
	void display()
	{
		System.out.println(id);
		System.out.println(name);
	}
	

}
