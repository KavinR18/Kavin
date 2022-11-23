package array;

public class PlacingAnNumberInLastIndex {

	public static void main(String[] args) {
		int ar[]= {10,20,30,40,50};
		int num=1234;
		ar[ar.length-1]=num;
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
	}

}
