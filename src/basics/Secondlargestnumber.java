package basics;

public class Secondlargestnumber {

	public static void main(String[] args) {
		int a[]= {4,5,8,25,77,15,74,64,9};
		int b=0,c=0,d=0;
		for (int i=0;i<a.length;i++)
		{	
			if(b<a[i]) {
		      b=a[i];
			}
		}
		System.out.println(b);
		for(int i=0;i<a.length;i++) {
			if (c<a[i])
				if (a[i]!=b)
					c=a[i];
		
		}System.out.println(c);		
		
		

}
}
