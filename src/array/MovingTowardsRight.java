package array;

public class MovingTowardsRight {

	public static void main(String[] args) {
		int ar[]= {10,20,30,40,50};
		int tem=ar[ar.length-1];
		for(int i=ar.length-1;i>0;i--) {
			ar[i]=ar[i-1];
		}
		ar[0]=tem;
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
	}

}
