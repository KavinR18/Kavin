package basics;

public class Swap3variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=5,b=3,c=7;
a=a+b+c;
b=a-(b+c);
c=a-(b+c);
a=a-(b+c);
System.out.println(a);
System.out.println(b);
System.out.println(c);

}
}