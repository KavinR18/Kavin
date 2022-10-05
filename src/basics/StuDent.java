package basics;

public class StuDent {
	int m1,m2,m3,m4,m5;
	void cal()
	{
		int cal=m1+m2+m3+m4+m5;
		System.out.println(cal);
	}

	public static void main(String[] args) {
	StuDent s1=new StuDent();
	s1.m1=93;
	s1.m2=85;
	s1.m3=100;
	s1.m4=99;
	s1.m5=100;
s1.cal();
	}

}
