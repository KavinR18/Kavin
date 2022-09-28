package basics;

public class Maths {
	 int a,b;
	 void add() {
		 System.out.println(a+b);
	 }  
	 void sub() {
		 System.out.println(a-b);
	 }
	 void mul() {
		 System.out.println(a*b);
	 }
	 void div() {
		 System.out.println(a/b);
	 }
	 public static void main(String args[]) {
		 Maths m1=new Maths();
		 m1.a=5;
		 m1.b=3;
		 m1.add();
		 m1.sub();
		 m1.div();
		 m1.mul();
		 
	 }
	 
	 
}
