package basics;

public class MaxArray {
	int max(int a[]) {
		int b=0;
		for(int i=0;i<a.length;i++)
		{
			if(b<a[i])
				b=a[i];
			
		}
		return b;
	}

	public static void main(String[] args) {
		MaxArray m=new MaxArray();
		int k[]= {3,54,52,11,14};
		int n=m.max(k);
		System.out.println(n);
		

	}

}
