package array;

public class TwoLargestNumber {

	public static void main(String[] args) {
		int[]values= {53,21,74,87,93,25};
		int big1=Integer.MIN_VALUE;
		int big2=Integer.MIN_VALUE;
		for(int i=0;i<values.length;i++) {
			if(values[i]>big1)
			{
				big2=big1;
				big1=values[i];
			}
			else if(values[i]>big2)
				big2=values[i];
		}
		System.out.println("First largest number is "+big1);

		System.out.println("Second largest number is "+big2);
	
	}

}
