package basics;

public class Payil2 {
		int first=-1;
		int second=1;
		int third;
		int div;
		void fib(int num) {
			third=first+second;
			first=second;
			second=third;
			
			if(num>0) {
				prime(third);
				fib(num-1);}
		}
		void prime(int third) {
			if(third>1) {
			div=2;
			int count=0;
			while(div<third) {
			if(third%div==0) {
			  count=count+1;
			}
			div=div+1;
			}
			if(count==0)
				System.out.print(third+" ");
		}
		}
		public static void main(String[]args) {
			Payil2 f=new Payil2();
			f.fib(15);

	}

}
