package basics;

public class Program {
  int n;
  Program(int n)
  {
	  this.n=n;
  }
  void m1()
  {
	  n++;
	  m2();	  
  }
  void m2()
  {
	  n++;
  }  
	  public static void main(String[] args) {
  
		  Program P1=new Program(6);
		  P1.m1();
		  System.out.println(P1.n);
		
	}

}
