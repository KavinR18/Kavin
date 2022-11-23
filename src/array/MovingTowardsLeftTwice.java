package array;

public class MovingTowardsLeftTwice {

	public static void main(String[] args) {
		int ar[]= {10,20,30,40,50};
		int times=2;
		while(times>0) {
			int tem=ar[0];
		for(int i=0;i<ar.length-1;i++) {
			ar[i]=ar[i+1];
		}
		times--;
		ar[ar.length-1]=tem;}
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
	}

}
