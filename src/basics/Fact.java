package basics;

public class Fact {
int fact(int a) {
	if(a>0) {
	int c=a*fact(a-1);
	return c;
	}
	return 1;
	}
public static void main(String args[]) {
	Fact F=new Fact();
	int a=F.fact(5);
	System.out.println(a);
	
}

}
