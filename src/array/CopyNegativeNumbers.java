package array;

public class CopyNegativeNumbers {

	public static void main(String[] args) {
		int[] ar = { 10, -12, 15, -17, -19, 20, -21 };
		
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
		if (ar[i] <0) {
				count++;
			}
		}
		int[] b = new int[count];
		int j = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i]<0) {
				b[j] = ar[i];
				j++;
			}
		}
				for (j = 0; j < b.length; j++) {
			System.out.print(b[j] + " ");
		}
	}

}
