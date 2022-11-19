package array;

public class ReverseArray {

	public static void main(String[] args) {
int[] ar= {32,43,52,68,98,65,46};
		int len=ar.length;
		for(int i=len-1;i>=0;i--) {
			System.out.print(ar[i]+" ");
		}
	}

}
