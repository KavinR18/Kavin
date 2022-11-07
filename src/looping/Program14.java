package looping;

public class Program14 {
	
	void findSum(int n) {
		int sum=0;
		while(n>0) {
			sum=sum+(n%10);
			n=n/10;
		}
		if(sum>9)
			findSum(sum);
		else
			System.out.println(sum);
		
	}
	public static void main(String[] args) {
		Program14 p=new Program14();
		p.findSum(8765);
		}

}
