package basics;

public class Sumofdigits {

	public static void main(String[] args) {


		
int num=7589;
int r=0;
int sum=0;
while(num>0) {
  r=num%10;
	//System.out.println(r);
	num=num/10;

sum=sum + r ;

}
System.out.println(sum);
}
}