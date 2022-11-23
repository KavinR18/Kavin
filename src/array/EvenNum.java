package array;

public class EvenNum {

	public static void main(String[] args) {
		int []ar= {12,34,31,13,24,72,17};
		int count=0;
		int total=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2==0) {
				count++;
			    total=total+ar[i];
				System.out.println(ar[i]);}
		}
	System.out.println("Total count of even number is "+count);
	System.out.println("Total of even number is "+total);
	}

}
