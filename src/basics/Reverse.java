package basics;

public class Reverse {

	public static void main(String[] args) {
	int num=7589;
	int reverse=0;
while(num>0)	
{
	int remainder=num%10;
	num=num/10;
	reverse=reverse*10+remainder;
}
System.out.println(reverse);
	}

}
