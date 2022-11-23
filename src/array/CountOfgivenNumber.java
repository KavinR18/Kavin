package array;

public class CountOfgivenNumber {

	public static void main(String[] args) {
		int[]values= {10,20,10,30,10,50,60};
		int num=10;
		int count=0;
	    for(int i=0;i<values.length;i++) {
	    	if(num==values[i])
	    		count++;
	    }
			System.out.println(num + " is present " +count +" times");
		
	}

}
