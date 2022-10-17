package basics;

class Cube implements SHape {
	int side;
   public void Area() {
		
		System.out.println(side*side*side);
	}

	public static void main(String[] args) {
		Cube c=new Cube();
		c.side=12;
		c.Area();
		
	}

}
