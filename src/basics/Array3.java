package basics;

public class Array3 {

	public static void main(String[] args) {
		int a[]= {2,4,5,3,6,7};
		int sum=0;
		int c;
		for (int i=0;i<a.length-1;i++)
		{
		sum=sum+a[i];
		c=a[i]-a[i+1];
		System.out.println(c);
		}
		
		System.out.println(sum);
	}

}
