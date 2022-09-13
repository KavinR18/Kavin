package basics;

public class Try {

	public static void main(String[] args) {
		int i=1;
		int j=0;
		int sum;
		do
		{
			sum=i+j;
				i=sum;
				j++;
				System.out.print( " " +sum);
				
			
			
		}
		while(sum<20);
	}

}