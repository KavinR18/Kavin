package array;

public class LowestValue {

	public static void main(String[] args) {
int[] ar= {32,-43,52,-68,98,65,46};
		int small=Integer.MAX_VALUE;
		for(int i=0;i<ar.length;i++) {
          if(small>ar[i])
		     small=ar[i];
		}
		System.out.println("Smallest value is "+small);
	}

}
