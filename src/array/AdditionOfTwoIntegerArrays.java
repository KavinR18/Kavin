package array;

public class AdditionOfTwoIntegerArrays {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6};
        int[] b = {1,2,3,4,7,8,17,19}; 
		
		int big = a.length>b.length?a.length: b.length; 
		int small = a.length<b.length?a.length: b.length; 
		int[] c = new int[big]; 
		for(int i=0; i<small; i++){
		c[i] = a[i] + b[i];
		}
		for(int i=small;i<big;i++) {
			c[i]=b[i];
		}
for(int i=0;i<c.length;i++) {
	System.out.print(c[i]+" ");
}

	}

}
