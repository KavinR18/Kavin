package patterns;

public class Pattern12 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1)
					System.out.print(j+" ");
				else if(i==n)
					System.out.print(i-j+1 +" ");
				else if(j==1)
					System.out.print(i+" ");
				else if(j==n)
					System.out.print(j-i+1 +" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
