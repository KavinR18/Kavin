package basics;

public class Count extends Basics {
	void count(int a) {
	int i=10;
	System.out.println(a);
	if(a<=i) {
	a++;
	count(a);
	}
	}
	public static void main(String[] args) {
		Count c=new Count();
		
		c.count(1);
	}

}
