package basics;

public class Largestnumberinarray {

	public static void main(String[] args) {
		int a[]= {7,90,123,45,56,74,35,839,20};
		int b=0;
		for(int i=0;i<a.length;i++)
		{
			if(b<a[i])
				b=a[i];
			
		}
		System.out.println(b);
	}

}
