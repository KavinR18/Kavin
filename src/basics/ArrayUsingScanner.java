package basics;
import java.util.Scanner;
public class ArrayUsingScanner {

	public static void main(String[] args) {
		int a[]=new int[7];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter the value of array : " +i);
			a[i]=sc.nextInt();	
			}
	
for(int j=0;j<a.length;j++)
{
	System.out.print(a[j]+" ");
}
}
}