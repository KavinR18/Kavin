package array;

public class CopingArrayInReverseOrder {

	public static void main(String[] args) {
		int ar[]= {5,2,6,8,9,3,7};
		int rev[]=new int[ar.length];
		int j=0;
		for(int i=ar.length-1;i>=0;i--) {
			rev[j]=ar[i];
			j++;
		}
		for(int i=0;i<rev.length;i++) {
				System.out.print(rev[i]+" ");
		}
	}

}
