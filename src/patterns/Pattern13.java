package patterns;

public class Pattern13 {

	public static void main(String[] args) {
int n=5;
for(int i=1;i<=n;i++) {
	for(int j=1;j<=n+1;j++) {
		if(i==2 || i==n-1) {
			if(j==n/2+1 ||j==n/2+3)
	               System.out.print("* ");
			else
				System.out.print("  ");}
		else if (i==n/2+1)
		{
			if(j==n/2 || j==n+1)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		else
			System.out.print("  ");
	}
	System.out.println();
}
	}

}
