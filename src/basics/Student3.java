package basics;

public class Student3 {
int rollNo;
String name;
int mark;
Student3(){
	rollNo=10;
	name="kavi";
	System.out.println(name);
	System.out.println(rollNo);
}
Student3(int rollNo,String name){
	this.rollNo=rollNo;
	this.name=name;
	System.out.println(name);
	System.out.println(rollNo);
	}
	public static void main(String[] args) {
		
		Student3 s=new Student3();
		Student3 s1=new Student3(2,"mandy");	
		
	}

}
