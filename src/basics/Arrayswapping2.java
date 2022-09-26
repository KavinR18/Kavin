package basics;

public class Arrayswapping2 {

	public static void main(String[] args) {
		int a[]= {1,2,3,7,6};
	
		int i,j;
	
		for(int k=0;k<3;k++) {
			int b=a[a.length-1];
		for ( i=a.length-1;i>0;i--) {
		a[i]=a[i-1];
		
	     }a[0]=b;
		}
		for ( j=0;j<a.length;j++) {
			System.out.println(a[j]);
		
		}
}
}