package basics;

public class Fibaonacciseries2 {

	public static void main(String[] args) {
		int a=-1;
		int b=1;
		
	
		for(int i=0;i<=10;i++)
		{
			
			System.out.println(a+b);
		
			b=a+b;
			a=b-a; //swapping variables technique
			
		
	}

}
}