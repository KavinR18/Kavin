package array;

public class OddNum {

	public static void main(String[] args) {
	int []ar= {12,34,31,13,5,7,17};
	int count=0;
	int total=0;
	for(int i=0;i<ar.length;i++) {
		if(ar[i]%2==1) {
			count++;
		    total=total+ar[i];
			System.out.println(ar[i]);}
	}
System.out.println("Total count of odd number is "+count);
System.out.println("Total of odd number is "+total);
}
}