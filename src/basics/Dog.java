package basics;

public class Dog extends Animal{
	void say() {
		System.out.println("i am dog");
	}

	public static void main(String[] args) {
		Animal a=new Animal();
		a.say();
		Dog d=new Dog();
		d.say();
		
	}

}
