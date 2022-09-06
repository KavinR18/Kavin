package basics;

public class Bingbang {

	public static void main(String[] args) {
	
		int n=15;
		if (n%3==0)
		{
			System.out.println("Bing");
		}
      if(n%5==0) {
    	  System.out.println("Bang");
      }
    	if(n%3!=0 && n%5!=0) {
    		System.out.println(n);
    	}
	}

}
