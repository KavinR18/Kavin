package array;

public class SmallestTwoNumber {

	public static void main(String[] args) {
		int[]values= {53,-21,74,87,93,25};
		int small1=Integer.MAX_VALUE;
		int small2=Integer.MAX_VALUE;
		for(int i=0;i<values.length;i++) {
			if(values[i]<small1)
			{
				small2=small1;
				small1=values[i];
			}
			else if(values[i]<small2)
				small2=values[i];
		}
		System.out.println("First smallest number is "+small1);

		System.out.println("Second smallest number is "+small2);
	
	}
	}


