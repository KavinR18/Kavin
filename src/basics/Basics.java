package basics;

public class Basics {
	int a;
void count() {
	for(int i=1;i<=a;i++)
	{System.out.print(i+" ");}
	System.out.println();
}
void pattern() {
	for(int i=1;i<=a;i++) {
		for(int j=1;j<=i;j++)
		{
			System.out.print(j+" ");
		}
		System.out.println();
	}
}
	public static void main(String[] args) {
		Basics b=new Basics();
		b.a=5;
		b.count();
		b.pattern();
	}

}
