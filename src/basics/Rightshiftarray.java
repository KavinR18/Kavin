package basics;

public class Rightshiftarray {

	public static void main(String[] args) {
		
		int a[]= {2,4,7,5,8,9};
		int b=a[0];
		
		
			for(int i=0;i<a.length;i++) {
		a[i]=a[i+1];
			
		}
		a[a.length-1]=b;
		for (int j=0;j<a.length;j++) {
			System.out.println(a[j]);
		
		}
	
	}

}
