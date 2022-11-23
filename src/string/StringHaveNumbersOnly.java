package string;

public class StringHaveNumbersOnly {

	public static void main(String[] args) {
		String name="bharathi123";
		try {
		int num=Integer.parseInt(name);
		System.out.println(num);
		}
		catch(NumberFormatException nfe) {
			System.out.println("no,not all nos");
		}
	}

}
