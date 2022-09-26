package basics;

public class Secondmaximuminarray {

	public static void main(String[] args) {
		int a[]= {50,34,23,56,23,52,54,34,56};
		int max=a[0];
		int b=0;
		int max1=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max)
			{
				max=a[i];
				b=i;
			}
		}
		System.out.println(max);
		System.out.println(b);
		max=a[b];
		
      for(int j=0;j<a.length;j++) {
    	  if(a[j]>max1 && a[j]!=max) {
    		  
    			  max1=a[j];
    		  
    	  }
      }
    	  System.out.println(max1);
	}

}
