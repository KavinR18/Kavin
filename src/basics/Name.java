package basics;

public class Name {

	public static void main(String[] args) {
		String name="KAVIN18";
		String vowels="aeiouAEIOU";
		for(int i=0;i<name.length();i++) {
			char c=name.charAt(i);
			for(int j=0;j<vowels.length();j++) {
				char k=vowels.charAt(j);
			if(c==k)
			System.out.println(c);
			}
		}
				
	}

}
