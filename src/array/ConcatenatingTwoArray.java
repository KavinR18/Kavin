package array;

public class ConcatenatingTwoArray {

	public static void main(String[] args) {
		int[] a = {10,20,30}; 
		int[] b = {40,50,60,70}; 
		int[]c=new int[a.length+b.length];
		int j=0;
		for(int i=0;i<a.length;i++) {
			c[j]=a[i];
			j++;
		}
		for(int i=0;i<b.length;i++) {
			c[j]=b[i];
			j++;
		}
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
	}

}
