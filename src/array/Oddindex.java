package array;

public class Oddindex {

	public static void main(String[] args) {
int[] ar= {32,43,52,68,98,65,46};
		
		for(int i=1;i<ar.length;i+=2) {
			System.out.print(ar[i]+" ");
		}
	}

}
