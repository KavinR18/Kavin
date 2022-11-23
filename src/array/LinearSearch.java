package array;

public class LinearSearch {

	public static void main(String[] args) {
		int []marks= {94,75,63,86,72};
		int mark=63;
		boolean present=false;
		for(int i=0;i<marks.length;i++) {
			if(mark==marks[i]) {
				present=true;
				System.out.println("Yes found at index " +i );
				break;
			}
		}
			if(present==false)
			System.out.println("Searched num is not present");
		
		
	}

}
