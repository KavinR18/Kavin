package basics;

public class Primenumberinarray {
	

	public static void main(String[] args) {
	int a[]= {8,9,7,5,6,3,4,7,11};
	
	int i=0,check,j;
	for(;i<a.length;i++)
	{
		check=0;
		for(j=2;j<a[i];j++) {
			if(a[i]%j==0) {
				check++;
			break;
		}
		}	
		if(check==0)
		System.out.print(a[i]+" ");
	}
	}

}
