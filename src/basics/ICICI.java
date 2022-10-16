package basics;

public class ICICI extends RBI{
	int intrestRate() {
		return 5;
	}
	public static void main(String args[]) {
		SBI s=new SBI();
		s.account();
		int s1=s.intrestRate();
		System.out.println(s1);
		ICICI i=new ICICI();
		i.account();
		int i1=i.intrestRate();
		System.out.println(i1);
	}

}
