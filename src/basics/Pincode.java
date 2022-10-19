package basics;

public class Pincode {

	public static void main(String[] args) {
		String pincode="chennai600061";
		boolean flag=false;
		
		for(int i=0;i<pincode.length();i++) {
			char c=pincode.charAt(i);
			
			if(c>=48 && c<=57)
				System.out.print(c);
			
             if(c>=48 && c<=57) {
            	 flag=true;
            	 }
               }
		if(flag==true)
                System.out.println("Have an number");	
		else
			System.out.println("Dont have an number");
		}

	}

	
