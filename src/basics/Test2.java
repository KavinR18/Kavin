package basics;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

for(int i=1;i<=50;i++)
	{
	if(i%3==0 && i%5==0)
	{
		System.out.println("Bing bang");
	}

      else if(i%3==0)
		{
			System.out.println("Bing");
	}
		else if(i%5==0)
        {
        	System.out.println("Bang");
        	
        }
		 else
        {
        	System.out.println(i);
        }
}
}
	}